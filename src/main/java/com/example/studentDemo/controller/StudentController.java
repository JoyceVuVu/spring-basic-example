package com.example.studentDemo.controller;

import com.example.studentDemo.models.Student;
import com.example.studentDemo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentRepository repository;
    @GetMapping
    public ResponseEntity<?> getStudent(){
        return ResponseEntity.status(HttpStatus.OK).body(repository.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable Long id){
        Optional<Student> student = repository.findById(id);
        if(student.isPresent()){
            return ResponseEntity.status(HttpStatus.OK).body(student);
        }else return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Not found student with id " + id);
    }
    @PostMapping("/insert")
    public ResponseEntity<?> insertStudent(@RequestBody Student student){
        return ResponseEntity.status(HttpStatus.OK).body(repository.save(student));
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateStudent(@RequestBody Student newStudent, @PathVariable Long id){
        Student updateStudent = repository.findById(id)
                .map(student -> {
                    student.setName(newStudent.getName());
                    student.setBirthday(newStudent.getBirthday());
                    student.setUniversity(newStudent.getUniversity());
                    return repository.save(student);
                }).orElseGet(() -> {
                    newStudent.setId(id);
                    return repository.save(newStudent);
                });
        return ResponseEntity.status(HttpStatus.OK).body(repository.save(updateStudent));
    }
    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> deleteStudentById(@PathVariable Long id){
        boolean exists = repository.existsById(id);
        if (exists){
            repository.deleteById(id);
            return ResponseEntity.status(HttpStatus.OK).body("Delete successfully");
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cannot delete");
    }

}

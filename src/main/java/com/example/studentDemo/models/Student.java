package com.example.studentDemo.models;

import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column( name = "birthday")
    @Temporal(value = TemporalType.DATE)
    private LocalDate birthday;
    @Column(name = "university")
    private String university;
//
//    @OneToMany
//    private Certificate certificate;

    public Student() {
    }

    public Student(String name, LocalDate birthday, String university) {
        this.name = name;
        this.birthday = birthday;
        this.university = university;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getUniversity() {
        return university;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
}

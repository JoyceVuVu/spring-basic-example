package com.example.studentDemo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.context.annotation.Primary;
@Entity
@Table(name = "class")
public class Clazz{
    @Id
    @Column(name = "id")
    private String idClass;
    @Column(name = "name")
    private String nameClass;

    public Clazz() {
    }

    public Clazz(String idClass, String nameClass) {
        this.idClass = idClass;
        this.nameClass = nameClass;
    }

    public String getIdClass() {
        return idClass;
    }

    public void setIdClass(String idClass) {
        this.idClass = idClass;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }
}

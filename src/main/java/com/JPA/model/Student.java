package com.JPA.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Entity
public class Student {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int age;
    private int rollNo;  // if we want to write rollNo in this way then in db it will be mapped to roll_no as sql is case-insensitive. and if we write rollno then it will show up as roll number only.
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + this.getAge() +
                ", rollNo=" + this.getRollNo() +
                ", name='" + this.getName() + '\'' +
                '}';
    }
}

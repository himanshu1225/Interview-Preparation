package com.example.firstques.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Student {

    public Student() {
        System.out.println("Student created at "+ this.hashCode());
    }
}

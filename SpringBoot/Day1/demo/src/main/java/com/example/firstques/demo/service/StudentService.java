package com.example.firstques.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.firstques.demo.model.Student;

@Service
public class StudentService {

    @Autowired
    private Student student;

    public StudentService() {
        System.out.println("StudentService created at "+ this.hashCode());
    }

    public Student getStudent() {
        return student;
    }
}

package com.example.firstques.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.firstques.demo.model.Student;
import com.example.firstques.demo.service.StudentService;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    public StudentController() {
        System.out.println("StudentController created at "+ this.hashCode());
    }

    @GetMapping("/student")
    public int getStudentAddress(){
        Student student =  studentService.getStudent();
        return student.hashCode();
    }

}

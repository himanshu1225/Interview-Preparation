package com.example.second.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevRestController {


    @GetMapping("/devRest")
    public String dev() {
        return "Himanshu!";    
    }

}

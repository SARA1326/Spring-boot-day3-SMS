package com.example.day3_sms.controller;

import com.example.day3_sms.model.Studentmodel;
import com.example.day3_sms.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Studentcontroller {
    private final StudentService service;
    public Studentcontroller(StudentService service){
        this.service = service;
    }
    @PostMapping("add-student/")
    public Studentmodel addstudent(@RequestBody Studentmodel student){
        return service.addstudent(student);
    }
}

package com.example.day3_sms.service;

import com.example.day3_sms.model.Studentmodel;
import com.example.day3_sms.repository.StudentRepository;

public class StudentService {
    private final StudentRepository repository;

    public StudentService(StudentRepository repository){
        this.repository = repository;
    }

    public Studentmodel addStudent(Studentmodel student){
        return repository.save(student);
    }
}
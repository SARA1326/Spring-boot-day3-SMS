package com.example.day3_sms.repository;
import com.example.day3_sms.model.Studentmodel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository <Studentmodel, String> {
}
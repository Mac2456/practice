package com.practice.service;

import com.practice.model.Student;
import com.practice.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentrepo;

    public List<Student> getall(){
        return studentrepo.findAll();
    }

}

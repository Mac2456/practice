package com.practice.controller;

import com.practice.model.Student;
import com.practice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentservice;

    @RequestMapping(/student)
    public List<Student> getall() {
        return studentservice.getall();
    }


}


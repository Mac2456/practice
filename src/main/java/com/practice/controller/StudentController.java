package com.practice.controller;

import com.practice.model.Student;
import com.practice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/student")
public class StudentController {

    @Autowired
    private StudentService studentservice;

    @GetMapping(path = "/getall")
    public List<Student> getdata() {
        return studentservice.getall();
    }


    @PostMapping(path = "/addname")
    public String addName(@RequestBody Student student){
        studentservice.addName(student);
        return "SAVED " + student.getStudent_Id() ;
    }

    @PostMapping(path = "/updatename")
    public String updateName(@RequestBody Student student){
        studentservice.updateName(student);
        return "Updated Id " + student.getStudent_Id();
    }
    @DeleteMapping(path = "/removeName/{id}")
    public String removeName(@PathVariable Integer id){
        studentservice.removeName(id);
        return "Deleted " + id;
    }



}


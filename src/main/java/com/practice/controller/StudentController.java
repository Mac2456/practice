package com.practice.controller;

import com.practice.Exception.StudentNotFoundException;
import com.practice.model.Student;
import com.practice.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/student")
public class StudentController {

    @Autowired
    private StudentService studentservice;

    Logger logger = LoggerFactory.getLogger(StudentController.class);

    @GetMapping(path = "/getall") // to get all student details
    public List<Student> getdata() {
        logger.trace("Jay Swaminarayan");
        return studentservice.getall();
    }

    @GetMapping(path = "/findnamebyid/{id}")
    public @ResponseBody Student findnamebyid(@PathVariable Integer id) throws StudentNotFoundException {
        return studentservice.getById(id);
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

   public static void getName(){
	System.out.println("This is a test method.");
    }



}


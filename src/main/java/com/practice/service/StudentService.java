package com.practice.service;

import com.practice.Exception.StudentNotFoundException;
import com.practice.model.Student;
import com.practice.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentrepo;

    public List<Student> getall(){
        return studentrepo.findAll();
    }

    public Student getById(Integer id) throws StudentNotFoundException {


        Optional<Student> opt = studentrepo.findById(id);
        //try {
            Student student = opt.orElseThrow(() -> new StudentNotFoundException());

            Student std = new Student();
            std.setStudent_Id(student.getStudent_Id());
            std.setStudentAge(student.getStudentAge());
            std.setStudentGrade(student.getStudentAge());
            std.setStudentLast(student.getStudentLast());
            std.setStudentName(student.getStudentName());


       // } catch (Exception e){}
        return student;
    }

    public Student addName(Student student) {
        return studentrepo.save(student);
    }


    public void updateName(Student student) {
        studentrepo.save(student);
    }

    public void removeName(Integer id) {

        studentrepo.deleteById(id);
    }
}

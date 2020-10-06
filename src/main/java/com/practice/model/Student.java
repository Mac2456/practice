package com.practice.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer student_Id;

    private String studentName;

    private String studentLast;

    private Integer studentAge;

    private double studentGrade;


   /* public Student(Integer studentId, String studentName, String studentLast, Integer studentAge, double studentGrade) {
        this.student_Id = studentId;
        this.studentName = studentName;
        this.studentLast = studentLast;
        this.studentAge = studentAge;
        this.studentGrade = studentGrade;
    }*/


}

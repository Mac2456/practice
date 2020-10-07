package com.practice.Exception;


public class StudentNotFoundException extends Exception {

    private static final long serialVersionUID = 1L;

    public StudentNotFoundException() {
        super("Student Not found");
    }

}

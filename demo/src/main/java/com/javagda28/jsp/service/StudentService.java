package com.javagda28.jsp.service;

import com.javagda28.jsp.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

//to jest singleton
public enum StudentService {
    INSTANCE;

    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student){
        students.add(student);
    }
    public void removeStudent(String indexNumber){
        // usuwanie po indexie
        students = students.stream()
            .filter(student -> !student.getIndexNumber().equals(indexNumber))
            .collect(Collectors.toList());
    }

    public List<Student> getStudents() {
        return students;
    }

    public Optional<Student> getStudentWithIndex(String indexNumber){
    return students.stream()
            .filter(student -> student.getIndexNumber().equals(indexNumber))
            .findFirst();
    }
}
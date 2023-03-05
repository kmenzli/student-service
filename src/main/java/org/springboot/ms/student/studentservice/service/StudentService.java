package org.springboot.ms.student.studentservice.service;

import org.springboot.ms.student.studentservice.model.Student;

import java.util.List;

public interface StudentService {
    Student findById(int id);
    Student findByName(String name);
    Student save(Student student);
    Iterable<Student> findAll();
}

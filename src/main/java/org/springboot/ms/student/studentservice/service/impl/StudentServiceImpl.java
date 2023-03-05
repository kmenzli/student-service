package org.springboot.ms.student.studentservice.service.impl;

import org.springboot.ms.student.studentservice.model.Student;
import org.springboot.ms.student.studentservice.repository.StudentRepository;
import org.springboot.ms.student.studentservice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student findById(int id) {
        return studentRepository.findById(id);
    }

    @Override
    public Student findByName(String name) {
        return studentRepository.findByName(name);
    }

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Iterable<Student> findAll() {
        return studentRepository.findAll();
    }
}

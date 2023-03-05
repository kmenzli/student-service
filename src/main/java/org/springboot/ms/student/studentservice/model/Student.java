package org.springboot.ms.student.studentservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@ToString
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String mobileNo;
    private int courseId;

    public Student() {
    }

    public Student(String name, String mobileNo, int courseId) {
        this.name = name;
        this.mobileNo = mobileNo;
        this.courseId = courseId;
    }
}

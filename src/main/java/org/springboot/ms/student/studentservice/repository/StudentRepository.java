package org.springboot.ms.student.studentservice.repository;

import org.springboot.ms.student.studentservice.model.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Long> {
    Student findById(int id);
    Student findByName(String name);
    @Query("SELECT s FROM Student s WHERE s.id >= :ids")
    public List<Student> listStudentWithIdOver(@Param("ids") Long ids);
}

package org.springboot.ms.student.studentservice;

import org.springboot.ms.student.studentservice.model.Student;
import org.springboot.ms.student.studentservice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class StudentServiceApplication implements CommandLineRunner {

	@Autowired
	StudentService studentService;
	public static void main(String[] args) {
		SpringApplication.run(StudentServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		studentService.save(new Student("Khemais", "00", 1));
		studentService.save(new Student("Abdo", "01", 1));
		studentService.save(new Student("Youssef", "02", 1));
		studentService.save(new Student("Osswa", "03", 1));
		studentService.save(new Student("Assil", "04", 1));

		Iterable<Student> iterator = studentService.findAll();

		System.out.println("All expense items: ");
		iterator.forEach(item -> System.out.println(item));
	}
}

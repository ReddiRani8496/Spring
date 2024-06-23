package com.xable.SpringJDBCEx;

import com.xable.SpringJDBCEx.model.Student;
import com.xable.SpringJDBCEx.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcExApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcExApplication.class, args);

		Student s1 = context.getBean(Student.class);
		s1.setId(1);
		s1.setName("Rani");
		s1.setMarks(80);

		StudentService studentService = context.getBean(StudentService.class);
		studentService.addStudent(s1);

		List<Student> students = studentService.getStudentList();
		System.out.println(students);

	}

}

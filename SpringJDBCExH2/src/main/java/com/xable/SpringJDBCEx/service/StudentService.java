package com.xable.SpringJDBCEx.service;

import com.xable.SpringJDBCEx.model.Student;
import com.xable.SpringJDBCEx.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentRepo studentRepo;

    @Autowired
    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }
    public void addStudent(Student student) {
        studentRepo.save(student);
    }

    public List<Student> getStudentList() {
        return studentRepo.findAll();
    }
}

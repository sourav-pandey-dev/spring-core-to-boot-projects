package com.sourav.studentcrud.service;

import com.sourav.studentcrud.model.Student;
import com.sourav.studentcrud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepository repo;

    public List<Student> findall(){
        return repo.findAll();
    }

    public void addStudent(Student student){
        repo.save(student);
    }
    public Student getStudentById(int id){
       return repo.findById(id).orElse(new Student());
    }

    public void UpdateStudent(Student student, int regNo){
        student.setRegNo(regNo);
        repo.save(student);
    }

    public  void deleteStudent(int regNo)
    {
        repo.deleteById(regNo);
    }
}

package com.sourav.studentcrud.controller;

import com.sourav.studentcrud.model.Student;
import com.sourav.studentcrud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    StudentService service;

//    Get all
    @GetMapping
    List<Student> findall(){
        return service.findall();
    }

//    Add student
    @PostMapping
    String addStudent(@RequestBody Student student){
        service.addStudent(student);
        return "Student " + student + " added sucessfully";
    }

//    Get by regNo
    @GetMapping("/{regNo}")
    Student getStudentById(@PathVariable int regNo){
      return  service.getStudentById(regNo);
    }

//    Update
    @PutMapping("/{regNo}")
    String UpdatStudent(@RequestBody Student student, @PathVariable int regNo) {
        service.UpdateStudent(student, regNo);
        return "student with regNo " + regNo + "updated successfully";
    }
//        Delete
        @DeleteMapping("/{regNo}")
                String deleteStudent(@PathVariable int regNo){
                service.deleteStudent(regNo);
                return "Student with " + regNo + "Deleted";

        }
    }


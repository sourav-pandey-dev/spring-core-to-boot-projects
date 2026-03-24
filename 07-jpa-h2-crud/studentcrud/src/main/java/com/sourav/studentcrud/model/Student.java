package com.sourav.studentcrud.model;

import jakarta.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer regNo;

    private String name;


    private String course;

    private int age;

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(Integer regNo) {
        this.regNo = regNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(Integer regNo, String name, String course, int age) {
        this.regNo = regNo;
        this.name = name;
        this.course = course;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "regNo=" + regNo +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", age=" + age +
                '}';
    }

    public Student() {
    }
}

package com.campus.model;

import java.util.*;

public class Student {

    // Instance variables
    private int studentId;
    private String studentName;
    private int age;
    private String department;
    private int[] marks;

    // Static variable to count students
    static int studentCount = 0;

    // Default constructor
    public Student() {
        studentCount++;
    }

    // Parameterized constructor
    public Student(int studentId, String studentName, int age, String department, int[] marks) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.department = department;
        this.marks = marks;
        studentCount++;
    }

    // Getter methods
    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public int[] getMarks() {
        return marks;
    }

    // Setter methods
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    // Display student information
    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Age: " + age);
        System.out.println("Student Department: " + department);
    }

    // Overloaded method to display student information with marks
    public void displayStudentInfo(boolean showMarks) {
        displayStudentInfo();

        if (showMarks) {
            System.out.println("Student Marks: " + java.util.Arrays.toString(marks));
        }
    }

    // Display total number of students
    public static void displayStudentCount() {
        System.out.println("Total Students: " + studentCount);
    }
}
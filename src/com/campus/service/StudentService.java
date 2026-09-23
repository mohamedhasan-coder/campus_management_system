package com.campus.service;

import com.campus.model.Student;

public class StudentService {

    // Calculate Total Marks
    public int calculateTotal(Student student) {

        if (student == null || student.getMarks() == null) {
            return 0;
        }

        int total = 0;

        for (int mark : student.getMarks()) {
            total += mark;
        }

        return total;
    }

    // Calculate Average Marks
    public double calculateAverage(Student student) {

        if (student == null || student.getMarks() == null
                || student.getMarks().length == 0) {
            return 0.0;
        }

        int total = calculateTotal(student);

        return (double) total / student.getMarks().length;
    }

    // Find Maximum Marks
    public int findMax(Student student) {

        if (student == null || student.getMarks() == null
                || student.getMarks().length == 0) {
            return 0;
        }

        int[] marks = student.getMarks();

        int max = marks[0];

        for (int mark : marks) {
            if (mark > max) {
                max = mark;
            }
        }

        return max;
    }

    // Find Minimum Marks
    public int findMin(Student student) {

        if (student == null || student.getMarks() == null
                || student.getMarks().length == 0) {
            return 0;
        }

        int[] marks = student.getMarks();

        int min = marks[0];

        for (int mark : marks) {
            if (mark < min) {
                min = mark;
            }
        }

        return min;
    }

    // Grade Based on User Marks

    public char grade(Student student){
        int marks[] = student.getMarks();
        if(marks == null || marks.length == 0){
            return 'F';
        }
        int total = calculateTotal(student);
        int average = (int)calculateAverage(student);
        if(average >= 90){
            return 'A';
        }
        else if(average >= 70) {
            return 'B';
        }
        else if(average >= 55){
            return 'C';
        }
        else if(average >= 40){
            return 'D';
        }
        else{
            return 'F';
        }

        // pass or Fail
        public String passOrFail(Student student){
            int[] marks = student.getMarks();
            if(marks == null || marks.length == 0) {
                return "Fail";
            }
            int average = (int)calculateAverage(student);
            if(average >= 40){
                return "Pass";
            }
            else{
                return "Fail";
            }
        }

        // Display Report Card
        public void displayReportCard(Student student){
            System.out.println("Student ID: " + student.getStudentId());
            System.out.println("Student Name: " + student.getStudentName());
            System.out.println("Total Marks: " + calculateTotal(student));
            System.out.println("Average Marks: " + calculateAverage(student));
            System.out.println("Maximum Marks: " + findMax(student));
            System.out.println("Minimum Marks: " + findMin(student));
            System.out.println("Grade: " + grade(student));
            System.out.println("Result : " + passOrFail(student));
        }
    }
}
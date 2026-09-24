package com.campus.app;

import java.util.Scanner;
import com.campus.model.Student;
import com.campus.service.StudentService;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // input from user

        System.out.print("Enter Student id: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Student age:");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Student department:");
        String department = sc.nextLine();
        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();
        int[] marks = new int[n];
        System.out.println("Enter marks for " + n + " subjects:");
        for (int i = 0; i < n; i++){
            System.out.print("enter marks for subject " + (i + 1) + ": ");
            marks[i]= sc.nextInt();
            sc.nextLine();
        }
        Student student = new Student(id, name, age, department, marks);
        student.displayStudentInfo(true);
        student.displayStudentCount();
        StudentService StudentService = new StudentService();
        StudentService.displayReportCard(student);
        sc.close();
    }
}
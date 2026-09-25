package com.campus.model;

public class ScholarshipStudent extends Student {

    private double scholarshipPercentage;

    // Constructor
    public ScholarshipStudent(int studentid,
                              String studentname,
                              int age,
                              String department,
                              int[] marks,
                              double scholarshipPercentage) {

        super(studentid, studentname, age, department, marks);

        this.scholarshipPercentage = scholarshipPercentage;
    }

    // Getter
    public double getScholarshipPercentage() {
        return scholarshipPercentage;
    }

    // Setter
    public void setScholarshipPercentage(double scholarshipPercentage) {
        this.scholarshipPercentage = scholarshipPercentage;
    }

    // Implement abstract method
    @Override
    public void studentType() {

        System.out.println("Student Type: Scholarship Student");
        System.out.println(
                "Scholarship Percentage: "
                        + scholarshipPercentage + "%"
        );
    }
}

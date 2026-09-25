package com.campus.model;

public class ScholarshipStudent extends Student {

    private double scholarshipPercentage;

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
        System.out.println("Scholarship Student");
    }

    @Override
    public void displayStudentInfo(){
        super.displayStudentInfo();
        System.out.println("Schorlarship Percentage: " + scholarshipPercentage);
    }

    @override
    public void displayStudentInfo(boolean showMarks){
        super.displatStudentInfo(showMarks);
    }
}

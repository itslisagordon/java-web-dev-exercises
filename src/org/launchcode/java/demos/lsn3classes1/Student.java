package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    //fields:
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    //constructors:
    public Student(String name, int studentId,
                   int numberOfCredits, double gpa) { //transfer student
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) { //new student
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = 0;
        this.gpa = 0.0;
    }

    //getters/setters:
    public String getName() {
        return this.name;
    }
    public void setName(String aName) {
        this.name = aName;
    }

    public int getStudentId() {
        return this.studentId;
    }
//    private void setStudentId(int anId) {
//        this.studentId = anId;
//    }

    public int getNumberOfCredits() {
        return this.numberOfCredits;
    }
//    private void setNumberOfCredits(int aNumberOfCredits) {
//        this.numberOfCredits = aNumberOfCredits;
//    }

    public double getGpa() {
        return this.gpa;
    }
//    private void setGpa(double aGpa) {
//        this.gpa = aGpa;
//    }

    //rather than setters, a method can change these fields:
    public void takeCourse(double grade, int credits) {
        //change GPA and credits for student based on arguments
    }

    public static void main(String[] args) {

    }

}
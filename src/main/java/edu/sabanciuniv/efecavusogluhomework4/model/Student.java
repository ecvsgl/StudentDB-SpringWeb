package edu.sabanciuniv.efecavusogluhomework4.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;

    private String studentFullName;

    private String studentDepartment;

    private String studentEnrollmentYear;

    private double studentCGPA;

    public Student(String studentFullName, String studentDepartment, String studentEnrollmentYear, double studentCGPA) {
        this.studentFullName = studentFullName;
        this.studentDepartment = studentDepartment;
        this.studentEnrollmentYear = studentEnrollmentYear;
        this.studentCGPA = studentCGPA;
    }

    public Student() {
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentFullName() {
        return studentFullName;
    }

    public void setStudentFullName(String studentFullName) {
        this.studentFullName = studentFullName;
    }

    public String getStudentDepartment() {
        return studentDepartment;
    }

    public void setStudentDepartment(String studentDepartment) {
        this.studentDepartment = studentDepartment;
    }

    public String getStudentEnrollmentYear() {
        return studentEnrollmentYear;
    }

    public void setStudentEnrollmentYear(String studentEnrollmentYear) {
        this.studentEnrollmentYear = studentEnrollmentYear;
    }

    public double getStudentCGPA() {
        return studentCGPA;
    }

    public void setStudentCGPA(double studentCGPA) {
        this.studentCGPA = studentCGPA;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId && studentFullName.equals(student.studentFullName) && studentEnrollmentYear.equals(student.studentEnrollmentYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, studentFullName, studentEnrollmentYear);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentFullName='" + studentFullName + '\'' +
                ", studentDepartment='" + studentDepartment + '\'' +
                ", studentEnrollmentYear='" + studentEnrollmentYear + '\'' +
                ", studentCGPA=" + studentCGPA +
                '}';
    }
}

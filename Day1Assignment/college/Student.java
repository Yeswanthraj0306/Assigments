package org.college;

public class Student extends Department {
	    public void studentName() {
	        System.out.println("Student Name: Yeswanth Raj");
	    }

	    public void studentDept() {
	        System.out.println("Student Department: Computer Application");
	    }

	    public void studentId() {
	        System.out.println("Student ID: 364");
	    }

public static void main(String[] args) {
	Student student = new Student();
    student.collegeName();
    student.collegeCode();
    student.collegeRank();
    student.deptName();
    student.studentName();
    student.studentDept();
    student.studentId();
	
}
	       
	}



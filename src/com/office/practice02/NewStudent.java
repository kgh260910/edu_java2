package com.office.practice02;

public class NewStudent {
	
	// 멤버필드
	
	int grade;
	int classNo;
	int studentNo;
	String studentName;
	boolean absence;

	public NewStudent() {
		System.out.println("NewStudent() CALLED!!");
	}

	public NewStudent(int classNo, int studentNo, String studentName) {
		this.classNo = classNo;
		this.studentNo = studentNo;
		this.studentName = studentName;
	}

	public NewStudent(int grade, int classNo, int studentNo, String studentName) {
		this.grade = grade;
		this.classNo = classNo;
		this.studentNo = studentNo;
		this.studentName = studentName;
	}

	public NewStudent(int grade, int classNo, int studentNo, String studentName, boolean absence) {
		this.grade = grade;
		this.classNo = classNo;
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.absence = absence;
	}
	
	
	public void printInfo() {
		System.out.println(grade);
		System.out.println(classNo);
		System.out.println(studentNo);
		System.out.println(studentName);
		System.out.println(absence);
	}

	

	
	
}

package com.office.practice02;

public class MainClass {

	public static void main(String[] args) {
		
		NewStudent student1 = new NewStudent();
		NewStudent student2 = new NewStudent(0, 0, null);
		NewStudent student3 = new NewStudent(0, 0, 0, null);
		NewStudent student4 = new NewStudent(0, 0, 0, null, false);
	
		student1.printInfo();
		student2.printInfo();
		student3.printInfo();
		student4.printInfo();
	}

}

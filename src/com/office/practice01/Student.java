package com.office.practice01;

public class Student {
	
	String name;
	int grade;
	int age;
	String major;
	
	public Student(
		String name,
		int grade,
		int age,
		String major) {
			System.out.println("-- CONSTRUCTOR --");
			
		this.name = name;
		this.grade = grade;
		this.age = age;
		this.major = major;
		}
	
	public void printInfo() {
		System.out.println("이름: " + name);
		System.out.println("학년: " + grade);
		System.out.println("나이: " + age);
		System.out.println("전공: " + major);
	
	}

}

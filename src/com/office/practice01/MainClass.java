package com.office.practice01;

public class MainClass {
	
	public static void main(String[] args) {
		
		Student student1 = new Student("홍", 1, 20, "컴퓨터");
		Student student2 = new Student("김", 2, 23, "스포츠");
		Student student3 = new Student("박", 3, 24, "생물");
			
		student1.printInfo();
		student2.printInfo();
		student3.printInfo();
	}

}

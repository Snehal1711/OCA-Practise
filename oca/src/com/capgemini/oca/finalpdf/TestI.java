package com.capgemini.oca.finalpdf;

class Student {
	String name;
	public Student(String name) {
		this.name=name;
	}
}
public class TestI {

	public static void main(String[] args) {
		Student[] students = new Student[3];
		students[1] = new Student("Snehal");
		students[2] = new Student("Shraddha");
		for (Student s :students) {
			System.out.println(" " +s.name);
		}
	}
}

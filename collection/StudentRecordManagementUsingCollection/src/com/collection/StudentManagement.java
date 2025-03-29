package com.collection;

import java.util.ArrayList;

public class StudentManagement {
	
	private ArrayList<Student> students = new ArrayList<>();
	
	public void addStudent(int rollNumber,String name,double marks) {
		
		students.add(new Student(rollNumber,name,marks));
		System.out.println("student added successfully!");
		
	}
	
	public void displayStudents() {
		if(students.isEmpty()) {
			System.out.println("no student found!");
			return;
		}
		for(Student s : students) {
			s.display();
			
		}
	}

}

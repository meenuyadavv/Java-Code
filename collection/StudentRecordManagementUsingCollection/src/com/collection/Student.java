package com.collection;

public class Student {
	
	private int rollNumber;
	private String name;
	private double marks;
	
	public Student(int rollNumber, String name, double marks) {
		
		this.rollNumber = rollNumber;
		this.name = name;
		this.marks = marks;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
				return marks;
		
	}

	public void setMarks(double marks) {
		if(marks >=0 && marks <= 100) {
			this.marks = marks;
		}else {
            System.out.println("Invalid marks! Please enter marks between 0-100.");

		}

	}
	
	 void display() {
	        System.out.println("Roll No: " + rollNumber + ", Name: " + name + ", Marks: " + marks);
	    }

}

//purpose student data ko store karega,user jo data dega vo essi class ke object mea store hoga

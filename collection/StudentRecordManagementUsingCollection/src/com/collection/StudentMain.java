package com.collection;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		StudentManagement sm = new StudentManagement();
		
		System.out.print("How Much Student Do You Want To Add ?");
		
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.println("\nstudent " +  (i + 1) + " enter the data");

		System.out.print("Enter Rollno :");
		int rollNumber = sc.nextInt();
		sc.nextLine(); // buffer clear 
		
		System.out.print("Enter Name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter Marks :");
		double marks = sc.nextDouble();
		
		sm.addStudent(rollNumber, name, marks);
		
		}
		System.out.println("\n-------- All Student Data ------------");
		sm.displayStudents();
		
	}

}

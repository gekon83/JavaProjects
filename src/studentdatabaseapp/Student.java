package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private int studentID;
	private String courses;
	private int tuitionBalance;
	private static int costOfCourse = 600;
	
	private static int studentNo = 0;
	
	// Constructor: prompt to enter name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter student first name");
		this.firstName = in.nextLine();

		System.out.println("Enter student last name");
		this.lastName = in.nextLine();

		System.out.println("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level");
		this.gradeYear = in.nextInt();
		
		setStudentID();
		
		System.out.println(firstName + " " + lastName + " " + gradeYear + " ID:" + studentID);
	}
	
	// Generate an ID
	private void setStudentID() {
		studentNo++;
		this.studentID = gradeYear * 10000 + studentNo;
	}
	
	// Enroll in courses
	
	// View balance
	
	// Pay tuition
	
	// Show status
}

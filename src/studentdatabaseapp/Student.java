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

		//setStudentInfo();
		setStudentInfo("Grzegorz", "Kozlowski", 3);
		
		setStudentID();
		
		System.out.println("Student: " + firstName + " " + lastName + " " + gradeYear + " ID:" + studentID);
		
		setStudentCourse();
	}
	
	// Input students information
	private void setStudentInfo() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter student first name");
		this.firstName = input.nextLine();

		System.out.println("Enter student last name");
		this.lastName = input.nextLine();

		System.out.println("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level");
		this.gradeYear = input.nextInt();
		
		input.close();		
	}

	// Input students information overloaded for testing
	private void setStudentInfo(String firstName, String lastName, int gradeYear) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gradeYear = gradeYear;
	}
	
	// Generate an ID
	private void setStudentID() {
		studentNo++;
		this.studentID = gradeYear * 10000 + studentNo;
	}
	
	// Enroll in courses
	//History 101 Mathematics 101 English 101 Chemistry 101 Computer Science 101
	private void setStudentCourse() {
		System.out.println("Choose classes to enroll:\n1 - History 101\n2 - Mathematics 101\n3 - English 101\n4 - Chemistry\n5 - 101 Computer\n6 - Science 101\nq or Q - Quit");
	}

	// View balance
	
	// Pay tuition
	
	// Show status
}

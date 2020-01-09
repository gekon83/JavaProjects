package studentdatabaseapp;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private int studentID;
	//private String courses = "";
	private ArrayList<String> courses;
	private int tuitionBalance;
	private static int costOfCourse = 600;
	
	private static int studentNo = 0;
	 
	// Constructor: prompt to enter name and year
	public Student() {

		setStudentInfo();
		//setStudentInfo("Grzegorz", "Kozlowski", 3);
		
		setStudentID();
				
		//setStudentCourse();
		
		//System.out.println("Student: " + firstName + " " + lastName + " " + gradeYear + " ID:" + studentID);
		showStatus();
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
		
		//input.close();		
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
	public void setStudentCourse() {
		
		this.courses = new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		char choice;
		
		// ### issue check if course already taken
		
		do {
			System.out.println("Choose classes: (1) History 101, (2) Mathematics 101, (3) English 101, (4) Chemistry 101, (5) Computer Science 101, (q) Quit");
			choice = input.next().charAt(0);
			switch (choice) {
			case '1':
				this.courses.add("History 101");
				this.tuitionBalance += costOfCourse;
				break;
			case '2':
				this.courses.add("Mathematics 101");
				this.tuitionBalance += costOfCourse;
				break;
			case '3':
				this.courses.add("English 101");
				this.tuitionBalance += costOfCourse;
				break;
			case '4':
				this.courses.add("Chemistry 101");
				this.tuitionBalance += costOfCourse;
				break;
			case '5':
				this.courses.add("Computer Science 101");
				this.tuitionBalance += costOfCourse;
				break;
			case 'q':
			case 'Q':
				System.out.println(" -- Enrolled finished --");
				break;
			default:
				System.out.println(" ## Wrong input. Try again. ##");
			}
		} while (choice != 'q');
		
	}

	// View balance
	public void viewBalance() {
		System.out.println("Tuition balance: $" + tuitionBalance);
	}
	
	// Pay tuition
	public void payTuition(int amount) {
		System.out.println("..paying for tuition with $" + amount);
		if (amount > tuitionBalance) {
			System.out.println("....your change: $" + (amount-tuitionBalance));
			tuitionBalance = 0;
		}
		else
			tuitionBalance -= amount;
		viewBalance();
	}
	
	public void payTuition() {
		System.out.println("..How much would you like to pay?");
		Scanner input = new Scanner(System.in);
		int amount = input.nextInt();
		//input.close();
		
		if (amount > tuitionBalance) {
			System.out.println("....your change: $" + (amount-tuitionBalance));
			tuitionBalance = 0;
		}
		else
			tuitionBalance -= amount;
		//input.close();
		viewBalance();		
	}
	
	// Show status
	public void showStatus() {
		//System.out.println("--- status ---");
		System.out.println("-- Student:\t" + firstName + " " + lastName + "\n\t\tGrade year: " + gradeYear + ", ID:" + studentID);
		System.out.println("\t\tCourses taken: " + courses + "\n\t\tTuition balance: $" + tuitionBalance);
		//viewBalance();
	}
}

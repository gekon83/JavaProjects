/*
 * Project 2
	
	Student Database Application
	
	Scenario: You are a Database Administrator for a university and need to create an application to manage student enrollments and balance.
	Your application should do the following:
	
	- Ask the user how many new students will be added to the database
	* The user should be prompted to enter the name and year for each student
	* The student should have a 5-digit unique ID, with the first number being their grade level
	* A student can enroll in the following courses: History 101 Mathematics 101 English 101 Chemistry 101 Computer Science 101
	* Each course costs $600 to enroll
	* The student should be able to view their balance and pay the tuition
	* To see the status of the student, we should see their name, ID, courses enrolled, and balance

*/

package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		
		Student stu1 = new Student();
		
		stu1.setStudentCourse();
		
		stu1.viewBalance();

		stu1.payTuition(100);
		stu1.payTuition();
		
		stu1.showStatus();
		
		/*
		// Ask how many users to add
		System.out.println("Enter how many students to enroll");
		Scanner input = new Scanner(System.in);
		int numOfStudents = input.nextInt();
		Student[] students = new Student[numOfStudents];
		
		// Create n number of students
		for (int n=0; n < numOfStudents; n++) {
			students[n] = new Student()
		}*/

	}

}

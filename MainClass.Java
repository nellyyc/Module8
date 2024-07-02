/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {

 public static void main(String[] args) {
		// ToDo 5: Fix the error

		// ToDo 6: Fix the constructor of the Student class

                // Todo 7: Create two classes for Freshman and Senior 

                // ToDo 8: The senior class should have a minimum of 85 credits  

		// ToDo 9: Add a toString method for the Student class
		// ToDo 10: Add a toString method for the Freshman class

	 Freshman freshman = new Freshman("James", (short) 20, 12); // name, age, credits
	 Senior senior = new Senior("John", (short) 30, 90);

		// ToDo 12: Set the gpa of the student using the scanner and user
		// 			input and then print the output.
	 Scanner scanner = new Scanner(System.in);

	 System.out.println("Enter GPA for " + freshman.getName() + ": ");
	 double gpa1 = scanner.nextDouble();
	 freshman.setGpa(gpa1);

	 System.out.println("Enter GPA for " + senior.getName() + ": ");
	 double gpa2 = scanner.nextDouble();
	 senior.setGpa(gpa2);

	 // Printing the details of the students
	 System.out.println(freshman);
	 System.out.println(senior);


		// ToDo 13: add comments and explain your code

	}

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 *
 * @author MoaathAlrajab
 */
public class Student extends Human {

    private double gpa;

	// ToDo 1: Make this class a child of Human
public Student(String name, short age) {
    super(name, age);
}

public Student(String name, short age, double gpa) {
    super(name, age);
    this.gpa = gpa;
}
	// ToDo 2: Fix the resulting errors

	// ToDo 3: Add a field for GPA and create a setter and a getter

    // Getter
    public double getGPS() {
    return gpa;
    }

    //Setter
    public void setGPA(double gpa) {
    this.gpa = gpa;
    }

    public String getAddress() {
    return super.address;
    }

    public void setAddress(String address) {
    super.address = address;
    }

    //Print student details
    public String toString() {
    return "Student [Name=" + getName() + ", Age=" + getAge() +
", Address=" + getAddress() + ", GPA=" + gpa + "]"; }
	// ToDo 4: Add comments to your code
}


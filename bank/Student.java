package com.bank;

public class Student {
 private int roll;
 private String name;
 private String address;
private int marks;
public void showdetails() {
	System.out.println("---------------------------");
	System.out.println("roll no is "+roll);
	System.out.println("Name is "+name);
	System.out.println("Address is "+address);
	System.out.println("marks obtained is "+marks);
	System.out.println("---------------------------");
}
public Student() {
	
}

public Student(int roll, String name, String address, int marks) {
	super();
	this.roll = roll;
	this.name = name;
	this.address = address;
	this.marks = marks;
}

}

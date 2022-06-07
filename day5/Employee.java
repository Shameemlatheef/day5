package com.day5;

public class Employee {
private int employeid;
private String employename;
private double salary;
private double netsalary;




 public Employee(int employeid, String employename, double salary,  int pfpercentage) {
	super();
	this.employeid = employeid;
	this.employename = employename;
	this.salary = salary;
//	this.netsalary = netsalary;
	setSalary(this.salary);
	calculateNetsalary(pfpercentage);
	
}


public int getEmployeid() {
	return employeid;
}


public void setEmployeid(int employeid) {
	this.employeid = employeid;
}


public String getEmployename() {
	return employename;
}


public void setEmployename(String employename) {
	this.employename = employename;
}


public double getSalary() {
	return salary;
}


public void setSalary(double salary) {
	this.salary = salary;
}
public double getNetsalary() {
	return netsalary;
}


public void setNetsalary(double netsalary) {
	this.netsalary = netsalary;
}



public void calculateNetsalary(int Pfpercentage) {
	double salary=getSalary();
	double pfsalary=salary*Pfpercentage/100;
	double netsalary=salary-pfsalary;
	setNetsalary(netsalary);
	
	 
 }

void show() {
	System.out.println("id is "+employeid);
	System.out.println("name is "+employename);
	System.out.println("salary is"+netsalary);
	
}

public static Employee emplyeedetails() {
	Employee d1=new Employee(101,"shameem",4444,9);
	return d1;
	
}
public static void main(String[] args) {
	emplyeedetails().show();
	
}
}

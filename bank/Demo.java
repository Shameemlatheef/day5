package com.bank;

import java.util.Scanner;

public class Demo {
public static void main(String[] args) {
	Scanner k=new Scanner(System.in);
	System.out.println("no of students");
	int n=k.nextInt();
	Student[] l=new Student[n];
	int sum=0;
     for(int i=0;i<n;i++) {
    	 System.out.println("enter student details of "+(i+1)+" student ");
    	 
    	 System.out.println("enter roll");
    	 int roll=k.nextInt();
    	 System.out.println("enter name");
    	 String name=k.next();
    	 k.nextLine();
    	 System.out.println("enter address ");
    	 String address=k.nextLine();
    	 System.out.println("enter marks");
    	 int marks=k.nextInt();
    	 sum= sum+marks;
    	 l[i]=new Student(roll,name,address,marks);
    	
    	 
     }
     for(int i=0;i<n;i++) {
    	 System.out.println("student details of "+(i+1)+" student ");
    	 l[i].showdetails();
    	 
     }
     
     System.out.println("Average of "+n+" students is "+(double)(sum/n));
   
}
}

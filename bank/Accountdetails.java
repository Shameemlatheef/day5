package com.bank;

import java.util.Scanner;

public class Accountdetails {
public Account getAccountdetails() {
	Scanner s=new Scanner(System.in);
	System.out.println("enter account id");
	int id=s.nextInt();
	System.out.println("enteraccount type");
    String type=s.next();
    System.out.println("enter balance");
     int bal=s.nextInt();
     if(bal<0) {
    	 System.out.println("enter valid balance");
       getAccountdetails();
     }
    
  	 return new Account(id,type,bal);
     
 
  
}
public int getwithdrawamount() {
	  System.out.println("enter amount to be withdraw");
	  Scanner l=new Scanner(System.in);
	  int amou=l.nextInt();
	  if(amou<0) {
		  
		 System.out.println("Enter valid number");
		 getAccountdetails();
	  }
	 
		  return amou;
	  
}
public static void main(String[] args) {
	
	Accountdetails A=new Accountdetails();
	Account B=A.getAccountdetails();
	int amou=A.getwithdrawamount();
	B.withdraw(amou);
	
	
	
}
}

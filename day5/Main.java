package com.day5;

import java.util.Scanner;

import com.tictek.Ticket;

public class Main {

	public static void main(String[] args) {

		Scanner d=new Scanner(System.in);
		System.out.println("enter id");
		int ticketid=d.nextInt();
		System.out.println("enter price");
		int ticketprice=d.nextInt();
		System.out.println("no of ticket");
		int nooftickets=d.nextInt();
		System.out.println("avaliable tickets");
		int availabletickets=d.nextInt();
		

		//
		
		Ticket g1=new Ticket(ticketid,ticketprice,nooftickets,availabletickets);
		g1.show();
		
		
		

	}

}

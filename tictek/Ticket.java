package com.tictek;

public class Ticket {
private int ticketid;
private int ticketprice;
private static int availableticket;
private int nooftickets;
public Ticket() {
	
}

public int calculatecost(int nooftickets) {
	if(availableticket< nooftickets) {
		return  -1;
		
	}else {
		int total=nooftickets*100;
		return  total;
	}
}
//public int getTicketid() {
//	return ticketid;
//}
//public void setTicketid(int ticketid) {
//	this.ticketid = ticketid;
//}
//public int getTicketprice() {
//	return ticketprice;
//}
//public void setTicketprice(int ticketprice) {
//	this.ticketprice = ticketprice;
//}
//public static int getAvailableticket() {
//	return availableticket;
//}
//public static void setAvailableticket(int availableticket) {
//	
//	Ticket.availableticket = availableticket;
//}



public Ticket(int ticketid, int ticketprice, int nooftickets,int availableticket) {
	super();
	this.ticketid = ticketid;
	this.ticketprice = ticketprice;
	this.nooftickets = nooftickets;
	this.availableticket =availableticket;
	

}
public void show() {
	System.out.println("ticketid "+ticketid);
	System.out.println("avaliable tickets "+(availableticket-nooftickets));
	if(availableticket<nooftickets) {
		System.out.println("ticktes not available");
	}
	else {
		System.out.println("total"+calculatecost(nooftickets));
	}
	
	
}
}

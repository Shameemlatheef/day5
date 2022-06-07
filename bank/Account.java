package com.bank;

public class Account {
private int accountid;
private String accounttype;
private int balance;

public Account(int accountid, String accounttype, int balance) {
	super();
	this.accountid = accountid;
	this.accounttype = accounttype;
	this.balance = balance;
}

public boolean withdraw(int amou) {
	if((balance-amou)>=0) {
		System.out.println("balance after withdraw "+(balance-amou));
		return true;
	}
	else {
		System.out.println("not enough balance");
		return false;
	}
	
}
}

package com.cpgi.lab7.bean;

public class Account {

	private int accountNo;
	private int amount;
	
	public Account(int acc, int amt)
	{
		super();
		this.accountNo= acc;
		this.amount= amt;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}

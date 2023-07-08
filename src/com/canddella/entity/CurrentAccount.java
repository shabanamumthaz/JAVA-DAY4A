package com.canddella.entity;

import java.time.LocalDate;

public class CurrentAccount extends Account {

	public CurrentAccount(String accountNo, LocalDate accountCreateDate, double accountBalance) {
		super(accountNo, accountCreateDate, accountBalance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void accountType() {
		setAccountType("Current Account");
		
	}

}

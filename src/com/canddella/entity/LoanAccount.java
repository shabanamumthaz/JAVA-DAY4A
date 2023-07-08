package com.canddella.entity;

import java.time.LocalDate;

public class LoanAccount extends Account {

	public LoanAccount(String accountNo, LocalDate accountCreateDate, double accountBalance) {
		super(accountNo, accountCreateDate, accountBalance);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void accountType() {
		setAccountType("Loan Account");
		
	}

}

package model.entities;

import model.exceptions.BusinessException;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account() {}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public void deposit(Double amount) {
		balance += amount;
	}
	
	public void withdraw(Double amount) {
		
		if ((amount > balance && amount < withdrawLimit) || balance == 0.0)
			throw new BusinessException("Not enough balance");
		
		if (amount > withdrawLimit)
			throw new BusinessException("The amount exceeds withdraw limit");
		
		balance -= amount;
		
	}

}

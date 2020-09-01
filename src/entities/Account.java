package entities;

import model.Exceptions.AccountExceptions;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance;
	private Double whithdrawLimit;
	
	public Account () {
	}

	public Account(Integer number, String holder, Double balance, Double whithdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.whithdrawLimit = whithdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getWhithdrawLimit() {
		return whithdrawLimit;
	}

	public void setWhithdrawLimit(Double whithdrawLimit) {
		this.whithdrawLimit = whithdrawLimit;
	}

	public void deposit(double amount) {
		balance += amount;
		}
	
	public void withdraw(double amount) {
		if(amount > getWhithdrawLimit()) {
			throw new AccountExceptions ("The amount exceeds withdraw limit");
		}
		if(amount > balance) {
			throw new AccountExceptions ("Not enough balance");
		}
		
		balance -= amount;
	} 
}

package com.wipro.CustomerAccountTracker.Bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AccountDetails")
public class AccountBean {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	
	@Column(name="AccountNumber")
	private long accountNumber;
	
	@Column(name="AccountType")
	private String accountType;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="BalanceAmount")
	private int balanceAmount;

	@Override
	public String toString() {
		return "AccountBean [userId=" + userId + ", accountNumber=" + accountNumber + ", accountType=" + accountType
				+ ", name=" + name + ", balanceAmount=" + balanceAmount + "]";
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalanceAmount() {
		return balanceAmount;
	}

	public void setBalanceAmount(int balanceAmount) {
		this.balanceAmount = balanceAmount;
	}


}

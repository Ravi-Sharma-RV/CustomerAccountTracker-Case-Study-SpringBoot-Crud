package com.wipro.CustomerAccountTracker.Bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TransactionDetails")
public class TransactionBean {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	
	@Column(name="BeneficiaryName")
	private String beneficiaryName;

	@Column(name="BeneficiaryAccountNumber")
	private long beneficiaryAccountNumber;
	
	@Column(name="Amount")
	private int amount;
	
	@Column(name="BalanceAmount")
	private int balanceAmount;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getBeneficiaryName() {
		return beneficiaryName;
	}

	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}

	public long getBeneficiaryAccountNumber() {
		return beneficiaryAccountNumber;
	}

	public void setBeneficiaryAccountNumber(long beneficiaryAccountNumber) {
		this.beneficiaryAccountNumber = beneficiaryAccountNumber;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getBalanceAmount() {
		return balanceAmount;
	}

	public void setBalanceAmount(int balanceAmount) {
		this.balanceAmount = balanceAmount;
	}

	@Override
	public String toString() {
		return "TransactionBean [userId=" + userId + ", beneficiaryName=" + beneficiaryName
				+ ", beneficiaryAccountNumber=" + beneficiaryAccountNumber + ", amount=" + amount + ", balanceAmount="
				+ balanceAmount + "]";
	}

	

	
	
	

}

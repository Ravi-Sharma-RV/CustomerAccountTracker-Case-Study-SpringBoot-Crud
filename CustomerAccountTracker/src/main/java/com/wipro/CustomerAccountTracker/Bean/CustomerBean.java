package com.wipro.CustomerAccountTracker.Bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="CustomerDetails")
public class CustomerBean {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	
	@Column(name="AccountNumber")
	private long accountNumber;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Gender")
	private String gender;
	
	@Column(name="Email")
	private String email;
	
	@Column(name="Contact")
	private String contact;
	
	@Column(name="AadharNo")
	private String aadharNo;
	
	@Column(name="AccountType")
	private String accountType;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	@Override
	public String toString() {
		return "CustomerBean [userId=" + userId + ", accountNumber=" + accountNumber + ", name=" + name + ", gender="
				+ gender + ", email=" + email + ", contact=" + contact + ", aadharNo=" + aadharNo + ", accountType="
				+ accountType + "]";
	}

}

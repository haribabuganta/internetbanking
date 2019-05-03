package com.hcl.retailbank.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "CustomerViewHistory")
public class CustomerViewHistory {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	@Column(name = "transactionId")
	private int transactionId;
	@Column(name = "transactionType")
	private String transactionType;
	@Column(name = "transactionDate")
	private Date transactionDate;
	@Column(name = "transactionAmount")
	private int transactionAmount;
	@Column(name = "fromAccountNumber")
	private int fromAccountNumber;
	@Column(name = "toAccountNumber")
	private int toAccountNumber;
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public int getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(int transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	public int getFromAccountNumber() {
		return fromAccountNumber;
	}
	public void setFromAccountNumber(int fromAccountNumber) {
		this.fromAccountNumber = fromAccountNumber;
	}
	public int getToAccountNumber() {
		return toAccountNumber;
	}
	public void setToAccountNumber(int toAccountNumber) {
		this.toAccountNumber = toAccountNumber;
	}
	
	
	
}

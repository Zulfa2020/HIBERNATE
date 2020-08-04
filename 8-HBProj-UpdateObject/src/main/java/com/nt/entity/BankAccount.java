package com.nt.entity;

import java.io.Serializable;

public class BankAccount implements Serializable {
	private Integer acno;
	private String  holderName;
	private float balance;
	
	public BankAccount() {
		System.out.println("BankAccount:: 0-param constructor");
	}
	
	public Integer getAcno() {
		return acno;
	}
	public void setAcno(Integer acno) {
		this.acno = acno;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "BankAccount [acno=" + acno + ", holderName=" + holderName + ", balance=" + balance + "]";
	}
	
	

}

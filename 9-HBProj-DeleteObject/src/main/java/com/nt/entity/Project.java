package com.nt.entity;

import java.io.Serializable;

public class Project implements Serializable{
	private Integer acno;
	private String accountholder;
	private float balance;
	
	public Integer getAcno() {
		return acno;
	}
	public void setAcno(Integer acno) {
		this.acno = acno;
	}
	public String getAccountholder() {
		return accountholder;
	}
	public void setAccountholder(String accountholder) {
		this.accountholder = accountholder;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Project [acno=" + acno + ", accountholder=" + accountholder + ", balance=" + balance + "]";
	}
	
	
	



}

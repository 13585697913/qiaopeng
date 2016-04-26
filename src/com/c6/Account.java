package com.c6;

public class Account {

	private double balance;
	
	public Account(double balance){
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public synchronized void draw(double drawAmount) throws InterruptedException{
		if(balance >= drawAmount){
			System.out.println(Thread.currentThread().getName()+"»°«Æ≥…π¶£∫"+drawAmount);
			Thread.sleep(1);
			balance -= drawAmount;
			System.out.println("”‡∂Ó"+balance);
		}else{
			System.out.println(Thread.currentThread().getName()+"£∫fails");
		}
	}
	
	
}

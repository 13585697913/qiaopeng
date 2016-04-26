package com.c6;
public class DrawThread2 extends Thread{

	
	private Account account;
	private double drawAmount;
	public DrawThread2(String name,Account account ,double drawAmount){
		super(name);//TODO 
		this.account = account;
		this.drawAmount = drawAmount;
	}
	public void run(){
		try {
			account.draw(drawAmount);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

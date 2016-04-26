package com.c6;

public class DrawThread extends Thread{

	
	private Account account;
	private double drawAmount;
	public DrawThread(String name,Account account ,double drawAmount){
		super(name);//TODO 
		this.account = account;
		this.drawAmount = drawAmount;
	}
	public void run(){
		
		synchronized(account){
			if(account.getBalance() >= drawAmount){
				System.out.println(this.getName()+"ȡǮ�ɹ���"+drawAmount);
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				account.setBalance(account.getBalance() - drawAmount);
				System.out.println("���"+account.getBalance());
			}else{
				System.out.println(this.getName()+"��fails");
			}
		}
	}
}

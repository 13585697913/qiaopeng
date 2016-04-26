package com.c3;

public class JoinThread2 implements Runnable{
	
	public void run (){
		for(int i = 0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
	
	
	public static void main(String [] args) throws InterruptedException{
		for(int i = 0;i<100;i++){
			if(i == 20){
				JoinThread2 jt = new JoinThread2();
				Thread t = new Thread(jt,"子线程");
				t.start();
				t.join();
			}
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}

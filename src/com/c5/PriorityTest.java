package com.c5;

public class PriorityTest extends Thread {

	public PriorityTest(String name){
		super(name);
	}
	
	public void run(){
		for(int i = 0;i<50;i++){
			System.out.println(this.getName()+",优先级： "+this.getPriority()+" "+i);
		}
	}
	
	
	public static void main(String [] args){
		Thread.currentThread().setPriority(Thread.NORM_PRIORITY);
		
		for(int i = 0;i<30;i++){
			if(i == 10){
				PriorityTest p = new PriorityTest("low");
				p.start();
				System.out.println("开始线程优先级"+p.getPriority());
				p.setPriority(Thread.MIN_PRIORITY);
			}
			
			if(i == 20){
				PriorityTest p = new PriorityTest("max");
				p.start();
				System.out.println("开始线程优先级"+p.getPriority());
				p.setPriority(Thread.MAX_PRIORITY);
				
			}
		}
	}
}

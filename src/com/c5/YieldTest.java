package com.c5;

public class YieldTest extends Thread{

	public YieldTest(String name){
		super(name);
	}
	
	public void run(){
		for(int i = 0;i<50;i++){
			System.out.println(this.getName()+" "+i);
			if(i == 20){
				Thread.yield();
			}
		}
	}
	
	public static void main(String [] args){
		YieldTest y1 = new YieldTest("Max");
		y1.setPriority(Thread.MAX_PRIORITY);//10  NORM_PRIORITY  5
		y1.start();
		YieldTest y2 =   new YieldTest("Min");
		y2.setPriority(Thread.MIN_PRIORITY);//1  NORM_PRIORITY  5
		y2.start();
	}
}

package com.c2;

public class SecondThread implements Runnable {

	//public int i;
	public void run(){
		for(int i = 0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+"  "+i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+" "+i);
			
			if(i == 20){
				SecondThread sh = new SecondThread();
				//创建第一个线程
				new Thread(sh,"线程1").start();
				//创建第二个线程
				new Thread(sh,"线程2").start();
			}
		}
	}

}

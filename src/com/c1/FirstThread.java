package com.c1;

public class FirstThread extends Thread {

	public int i;
	public void run(){
		for(;i<100;i++){
			System.out.println(this.getName()+"  "+i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+" "+i);
			
			if(i == 20){
				//������һ���߳�
				new FirstThread().start();
				//�����ڶ����߳�
				new FirstThread().start();
			}
		}
	}

}

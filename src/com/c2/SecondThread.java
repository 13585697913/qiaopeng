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
				//������һ���߳�
				new Thread(sh,"�߳�1").start();
				//�����ڶ����߳�
				new Thread(sh,"�߳�2").start();
			}
		}
	}

}

package com.c6;

public class DrawTest2 {

	public static void main(String [] args){
		Account acc = new Account(1000);
		
		new DrawThread2("A",acc,800).start();
		
		new DrawThread2("B",acc,800).start();
	}
}

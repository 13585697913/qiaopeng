package com.c6;

public class DrawTest {

	public static void main(String [] args){
		Account acc = new Account(1000);
		
		new DrawThread("A",acc,800).start();
		
		new DrawThread("B",acc,800).start();
	}
}

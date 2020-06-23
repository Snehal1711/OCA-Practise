package com.capgemini.oca.practice;

public class Test {

	void readCard(int cardNo) throws Exception{
		System.out.println("Read");
	}
	
	void checkCard(int cardNo) throws RuntimeException{
		System.out.println("Check");
	}
	
	public static void main(String[] args) throws Exception {
		Test ex = new Test();
		int cardNo=12345;
		ex.checkCard(cardNo);
		ex.readCard(cardNo);
	}
}

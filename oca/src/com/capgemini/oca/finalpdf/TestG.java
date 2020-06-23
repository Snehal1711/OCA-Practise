package com.capgemini.oca.finalpdf;

public class TestG {

	void readCard(int cardNo) throws Exception{
		System.out.println("Read");
	}
	
	void checkCard(int cardNo) throws RuntimeException{
		System.out.println("Check");
	}
	
	public static void main(String[] args) {
		TestG ex = new TestG();
		int cardNo = 12344;
		ex.checkCard(cardNo);
		//ex.readCard(cardNo);
	}
}

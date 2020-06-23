package com.capgemini.oca.corrected;

public class TestG {

	public static void main(String[] args) {

		float f = (float)1_00.00;
		int numbers[];
		numbers = new int[2];
		numbers[0]= 10;
		numbers[1]= 20;
		for(int x : numbers) {
			System.out.println(" " +x);
		}
		numbers = new int [4];
		numbers[2]= 30;
		numbers[3]= 40;
		
		for(int x : numbers) {
			System.out.println(" " +x);
		}
		
	}

}

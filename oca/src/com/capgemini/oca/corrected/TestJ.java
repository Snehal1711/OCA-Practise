package com.capgemini.oca.corrected;

public class TestJ {
	public static void main(String[] args) {
		Boolean[] bool = new Boolean[2];
		
		bool[0] = new Boolean(Boolean.parseBoolean("true"));
		bool[1] = new Boolean(null);
		Boolean b1 = new Boolean(null);
		System.out.println(b1);
		System.out.println(bool[0] + " "+bool[1]);
	}
}

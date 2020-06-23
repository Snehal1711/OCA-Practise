package com.capgemini.oca.corrected;

public class TestC {

	public static void main(String[] args) {
		TestC ts = new TestC();
		System.out.println(isAvailable + " ");
		isAvailable = ts.dostuff();
		System.out.println(isAvailable);
	}
	 public static boolean dostuff() {
		 return !isAvailable;
		 
	 }
	 static boolean isAvailable = false;
	 
}

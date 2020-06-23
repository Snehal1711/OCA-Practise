package com.capgemini.oca.corrected;

import static com.capgemini.oca.practice.Shirt.getColor;

public class Jeans {
	public void matchShirt() {
		String color = getColor();
		if(color.equals("Green")){
			System.out.println("Fit");
		}
	}
	public static void main(String[] args) {
		Jeans trouser = new Jeans();
		trouser.matchShirt();
	}
}

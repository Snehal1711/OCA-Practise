package com.capgemini.oca.finalpdf;

public class TestB {

	public static void main(String[] args) {
		String names[]= {"Thomas", "Peter","Joseph"};
		String pws[] = new String [3];
		int idx = 0;
		try {
			for(String n : names) {
				pws[idx] = n.substring(2,6);
				idx++;
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Invalid name");
		}
		
		for(String p : pws) {
			System.out.println(p);
		}
	}
}

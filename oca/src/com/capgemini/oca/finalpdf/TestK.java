package com.capgemini.oca.finalpdf;

public class TestK {

	public static void main(String[] args) {
		String[] strs = new String[2];
		int i = 0;
		for (String s : strs) {
			strs[i].concat(" elemet" + i);
			i++;
		}
		
		for(i = 0 ; i <strs.length;i++) {
			System.out.println(strs[i]);
		}
	}
}

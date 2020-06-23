package com.capgemini.oca.corrected;

public class TestD {
	public static void main(String[] args) {
		String[] strs = new String[2];
		//strs[0]="snehal";
		//strs[1]="snehal";
		int idx = 0 ;
		for (String s : strs) {
			strs[idx].concat(" element " + idx);
			idx++;
		}
		for(idx = 0 ; idx < strs.length; idx++ ) {
			System.out.println(strs[idx]);
		}
	}

}

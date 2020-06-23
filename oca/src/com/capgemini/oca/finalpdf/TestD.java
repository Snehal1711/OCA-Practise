package com.capgemini.oca.finalpdf;

public class TestD {
	public static void main(String[] args) {
		int nums[] = new int[3];
		int nums2[] = {1,2,3,4,5};
		nums=nums2;
		for(int x : nums) {
			System.out.println(x+" ");
		}
	}
}

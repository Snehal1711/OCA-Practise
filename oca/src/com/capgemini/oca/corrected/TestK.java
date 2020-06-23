package com.capgemini.oca.corrected;

public class TestK {
public static void main(String[] args) {
	int nums1[] = new int[3];
	System.out.println(nums1);
	int nums2[] = {1, 2, 3, 4, 5} ;
	System.out.println(nums2);
	nums1 = nums2;
	System.out.println(nums1);
	System.out.println(nums2);
	for(int x : nums1) {
		System.out.print(x + ":");
	}
}
	
}

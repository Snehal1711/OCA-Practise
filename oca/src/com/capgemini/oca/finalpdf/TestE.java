package com.capgemini.oca.finalpdf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestE {

	public static void main(String[] args) {
		String[] arr = {"Hi", "How", "are", "you"};
		List<String> arrList = new ArrayList<>(Arrays.asList(arr));
		if(arrList.removeIf((String s) -> {return s.length() <=2;})) {
			String s = null;// this line should be there
			System.out.println(s + "removed");
		}
	}
}

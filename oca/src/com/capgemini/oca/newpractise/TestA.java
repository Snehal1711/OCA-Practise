package com.capgemini.oca.newpractise;

class OraString {
	String s;

	public boolean equals(OraString str) {
		System.out.println(this.s);
		System.out.println(str);
		return this.s.equalsIgnoreCase(str.toString());
	}

	OraString(String s) {
		this.s = s;
	}
}

public class TestA {

	public static void main(String[] args) {
		String s1 = "Moon";
		OraString s2 = new OraString("Moon");
		System.out.println(s1 == "Moon");
		System.out.println(s2.equals("Moon"));
		 if((s1 == "Moon")&&(s2.equals("Moon"))) {
			 System.out.println("A");
		 }else {
			 System.out.println("B");
		 }
		 
		 if(s1.equalsIgnoreCase(s2.s)) {
			 System.out.println("C");
		 }else {
			 System.out.println("D");
		 }
	}
}

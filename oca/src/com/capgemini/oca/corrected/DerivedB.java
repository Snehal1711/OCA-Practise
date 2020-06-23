package com.capgemini.oca.corrected;
class Base {
	public void test() {
		System.out.println("base");
	}
}

class DerivedA extends Base{
	public void test() {
		System.out.println("DerivedA");
	}
}
public class DerivedB extends DerivedA{
	public void test() {
		System.out.println("DerivedB");
	}
	
	public static void main(String[] args) {
		Base b1 = new DerivedB();
		System.out.println(b1);
		Base b2 = new DerivedA();
		System.out.println(b2);
		Base b3 = new DerivedB();
		System.out.println(b3);
		b1 = (Base)b3;
		System.out.println(b1);
		Base b4 = (DerivedA)b3;
		System.out.println(b4);
		b1.test();
		b4.test();
	}
}

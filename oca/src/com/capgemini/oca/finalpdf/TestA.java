package com.capgemini.oca.finalpdf;
interface Abc{
	public void readBook();
	public void setbookMark();
	
}

abstract class Book implements Abc{
	
}
public abstract class TestA extends Book{
	public int amount ;
	public TestA() {
		amount = 100;
	}
}

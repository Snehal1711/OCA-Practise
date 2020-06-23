package com.capgemini.oca.corrected;

interface Downloadable {
	public void download();
}

interface Readable extends Downloadable{
	public void readBook();
}

abstract class Book implements Readable{
	public void readBook() {
		System.out.println("Read Book");
	}
}
public class EBook extends Book  {
	public void readBook() {
		System.out.println("read E Book");
	}

	@Override     // method has to ne over ride
	public void download() {
		// TODO Auto-generated method stub
		
	}
}

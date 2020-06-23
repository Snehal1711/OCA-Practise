package com.capgemini.oca.finalpdf;

import java.util.ArrayList;

public class TestC {

	/*private TestC(){
		
	}
	
private TestC(int a){
		
	}
	*/
	public static void main(String[] args) {
		ArrayList myList = new ArrayList();
		String[] myArray;
		try {
			while(true) {
				myList.add("My String");
			}
		} catch (RuntimeException e) {
			System.out.println("RunTime ");
		}catch(Exception e){
			System.out.println("Exception");
		}
		System.out.println("Ready to Use");
	}
}

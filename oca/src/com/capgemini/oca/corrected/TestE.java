package com.capgemini.oca.corrected;

public class TestE {

	public static void main(String[] args) {
		int iVar = 100;
		float fVar = 100.100f;
		double dVar = 123;
		iVar = (int) fVar;
		fVar = iVar;
		dVar = fVar;
		fVar = (float) dVar;
		dVar = iVar;
		}
	
	
}

package com.capgemini.oca.corrected;

import java.util.ArrayList;
import java.util.List;

class Patient{
	String name ;
	public Patient(String name) {
		this.name=name;
	}
}
public class TestH {
	public static void main(String[] args) {
		List ps = new ArrayList<>();
		Patient p2 = new Patient("Mike");
		ps.add(p2);
		int f = ps.indexOf(p2);
		if(f>=0) {
			System.out.println("Mike Found");
		}else {
			System.out.println("-----");
		}
	}
}

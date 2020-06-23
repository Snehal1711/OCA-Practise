package com.capgemini.oca.newpractise;

abstract class Robot implements Spekable{
	public abstract void process();
}

class Humanoid extends Robot {

	@Override
	public void speak(String s) {
		System.out.println(s);
	}

	@Override
	public void process() {
		System.out.println("Helping.....");
	}
	
}
interface Spekable{
	public void speak(String s);
}
public class RobotApp {
	public static void main(String[] args) {
		Robot r = new Humanoid();
		r.process();
		r.speak("Done");
	}
}

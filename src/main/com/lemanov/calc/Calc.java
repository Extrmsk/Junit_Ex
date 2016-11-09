package com.lemanov.calc;

public class Calc {
	
	public int add(int a, int b) {
		System.out.println("commt in master");
		System.out.println("commmit im master2");
		System.out.println("after merge");
		return a+b;
	}
	
	public int div(int a, int b) {
		System.out.println("This is new line in new branch");
		return a/b;
	}
	
}

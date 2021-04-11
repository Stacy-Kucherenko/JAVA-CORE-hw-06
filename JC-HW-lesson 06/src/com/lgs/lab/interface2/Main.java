package com.lgs.lab.interface2;

public class Main {
	
	public static void main(String[] args) {
		MyCalculator cal = new MyCalculator(20, 5);
		
		System.out.println(cal);
		cal.toAdd();
		
		System.out.println(cal);
		cal.toSubtract();
		
		System.out.println(cal);
		cal.toMultiply();
		
		System.out.println(cal);
		cal.toDevide();
		
	}
	
	

}

package com.lgs.lab.interface2;

import com.lgs.lab.interface1.Numerable;

public class MyCalculator implements Numerable {
	
	private int a;
	private int b;
	
	

	public MyCalculator(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	

	public int getA() {
		return a;
	}



	public void setA(int a) {
		this.a = a;
	}



	public int getB() {
		return b;
	}



	public void setB(int b) {
		this.b = b;
	}



	@Override
	public void toAdd() {
		System.out.println("The sum is " + (a + b));
		
		
	}

	@Override
	public void toSubtract() {
		System.out.println("The defference is " + (a - b));
		
	}

	@Override
	public void toMultiply() {
		System.out.println("The product is " + (a*b));
		
	}

	@Override
	public void toDevide() {
		System.out.println("The quotient is " + (a / b));
		
		
	}



	@Override
	public String toString() {
		return "Specified parameters: a=" + a + ", b=" + b;
	}




	
	

}

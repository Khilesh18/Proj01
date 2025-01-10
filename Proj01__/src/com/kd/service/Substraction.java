package com.kd.service;

public class Substraction {

	public static void main(String[] args) {
		

		System.out.println("10-9=1");
		System.out.println("20-9=11");
		System.out.println("30-9=21");
		System.out.println("40-9=31");

		int x=19;
		int y=33;
		int sub = Sub(x, y);
		System.out.println("Substraction:" +sub);


	}
	
	public static int Sub(int x,int y) {
		
		return y-x;
		
	}
	
	

}

package com.naniTech.Programs;

public class MultiplicationOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 192;
		getMultiplicate(number);
	}
	
	public static void getMultiplicate(int num) {
		
		System.out.println("Muliplicate of the table "+num+" is:");
		for(int i=1; i <=20; i++) {
			
			System.out.println(num+" * "+i+" = "+(num*i));
		}
	}

}

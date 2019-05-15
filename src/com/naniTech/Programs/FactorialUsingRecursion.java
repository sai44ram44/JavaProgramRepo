package com.naniTech.Programs;

public class FactorialUsingRecursion {

	public static void main(String[] args) {
		
		int num = 5;
		double factorial = getFactorialNumber(num);
		System.out.println("Factorial of the number is: "+factorial);

	}
	
	public static long getFactorialNumber(int num) {
		
		if(num >= 1) {
			return num * getFactorialNumber(num-1);
		} else {
			return 1;
		}
	}

}

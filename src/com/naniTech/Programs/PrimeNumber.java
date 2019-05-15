package com.naniTech.Programs;

public class PrimeNumber {

	public static void main(String[] args) {
	
		int number = 19;
		boolean result = verifyPrimeNumer(number);
		if(result) {
			System.out.println(number +" is a prime number");
		} else {
			System.out.println(number +" is a not a prime number");
		}
	}
	
	public static boolean verifyPrimeNumer(int num) {
		
		int count = 0;
		
		for(int i=1; i<=num; i++) {
			
			if(num%i == 0) {
				
				count++;
			}
		}
		
		if(count>2) {
			return false;
		} else {
			return true;
		}
		
	}

}

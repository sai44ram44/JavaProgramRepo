package com.naniTech.Programs;

public class PrimeNumberInRange {

	public static void main(String[] args) {
		
		int range1 = 5;
		int range2 = 40;
		
		for(int j = range1; j <= range2; j++) {
			
			boolean result = PrimeNumber.verifyPrimeNumer(j);
			if(result) {
				System.out.println(j +" is a prime number");
			} else {
				System.out.println(j +" is a not a prime number");
			}
		}

	}

}

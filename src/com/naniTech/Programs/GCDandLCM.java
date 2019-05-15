package com.naniTech.Programs;

public class GCDandLCM {

	public static void main(String[] args) {
		
		int gcd = getGCDofNumbers(12,13);
		System.out.println("GCD of two number is: "+gcd );
		int lcm = getLCMofNumbers(12,13);
		System.out.println("LCM of two number is: "+lcm );

	}
	
	public static int getGCDofNumbers(int num1,int num2) {
		
		
		int greatest,least,result;
		if(num1 > num2) {
			
			greatest = num1;
			least = num2;
			result = num2;
		} else {
			
			greatest = num2;
			least = num1;
			result = num1;
		}
		
		while(result!=0) {
			
			result = greatest%least;
			greatest = least;
			least = result;
			
		}
		
		return greatest;
			
	}
	
	public static int getLCMofNumbers(int num1, int num2) {
		
		return (num1*num2)/getGCDofNumbers(num1,num2);
	}

}

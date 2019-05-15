package com.naniTech.Programs;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int num=123;
		int result = reverseNumber(num);
		System.out.println(result);
	}
	
	public static int reverseNumber(int num) {
		int rem, rev=0;
		
		while(num!=0) {
			
			rem = num%10;
			rev = rev*10+rem;
			num = num/10;
			
		}
		
		return rev;
	}

}

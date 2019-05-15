package com.naniTech.Programs;

public class PalandromeNumber {

	public static void main(String[] args) {
		int num = 121;
		int temp = num;
		int rev = 0;
		
		while(num != 0) {
			
			int rem = num%10;
			rev = rev*10+rem;
			num = num/10;		
		}
		
		if(rev == temp) {
			System.out.println("Its a palandrome");
		} else {
			System.out.println("Not a palandrome");
		}

	}

}

package com.naniTech.Programs;

import java.util.Scanner;

public class AmStrongNumber {
	
	public static void main (String[] args) {
		
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		double intialNum = num;
		double lengthNum = Integer.toString(num).length();
		double AmStrongNum = 0;
		
		while(num != 0) {
			
			int rem = num%10;
			AmStrongNum = AmStrongNum+ Math.pow(rem, lengthNum);
			num = num/10;
			
		}
		
		System.out.println(AmStrongNum);
		
		if(intialNum == AmStrongNum) {
			
			System.out.println(AmStrongNum+" Number is AmStrong");
		} else {
			
			System.out.println(intialNum+" Number is not a AmStrong ");
		}
	
		
	}

}

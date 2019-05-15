package com.naniTech.Programs;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a Year:");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		boolean prime = false;
		if(number%400 == 0 || number%4 == 0) {		
			prime = true;
			
		} else if(number%100 == 0) {
			prime = false;
		}
		
		if(prime) {
			System.out.println("Entered is a leap year:"+number);
		}
		else {
			System.out.println("Entered is not a leap year:"+number);
		}
	}
	
}

package com.naniTech.Programs;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int fact = 1;
		for (int i=1; i <= number; i++ ) {
			
			fact = fact*i;
			
		}
		System.out.println("Factorial of the number is "+fact);
		
		

	}

}

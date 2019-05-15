package com.naniTech.Programs;

public class LargerSmallerNumber {

	public static void main(String[] args) {
		
		int numbers[] = {1,5,78,-15,-90,343,9,532,-974};
		
		int largest = numbers[0];
		int smallest = numbers[0];
		
		for (int i=1; i < numbers.length; i++) {
			
			if(numbers[i] > largest) {
				
				largest = numbers[i];
				
			}
		else if(numbers[i] < smallest) {
			
			smallest = numbers[i];
			
		}
			
		}
		
		System.out.println("Largest Number is :"+largest);
		System.out.println("Smallest Number is :"+smallest);
		

	}

}

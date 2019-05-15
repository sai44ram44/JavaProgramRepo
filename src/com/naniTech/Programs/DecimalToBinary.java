package com.naniTech.Programs;

public class DecimalToBinary {

	public static void main(String[] args) {
		
		int num = 19;
		int temp = changeDecimalToBinary(num);
		int result = ReverseNumber.reverseNumber(temp);
		System.out.println(result);
	}
	
	public static int changeDecimalToBinary(int num) {
		
		int rem,binary=0;
		
		while(num != 0) {
			rem = num%2;
			binary = binary+rem;
			binary = binary*10;
			num = num/2;
			
		}
		
		return binary;
	}

}

package com.naniTech.Programs;

public class BinaryToDecimal {

	public static void main(String[] args) {
		
		int num = 1011;
		int result = convertBinaryToDecimal(num);

		System.out.println("Decimal for the Binary value is :"+result);
	}
	
	public static int convertBinaryToDecimal(int num) {
		int i = 0, rem,decimal=0;
		while(num != 0) {
			
			rem = num%10;
			decimal = decimal + (int) (rem*Math.pow(2, i));
			num = num/10;
			i++;
		}
		
		return decimal;
	}

}

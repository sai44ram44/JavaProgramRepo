package com.naniTech.Programs;

public class calculationSwitch {

	public static void main(String[] args) {
		
		getCalculate(10, 5, "add");
		

	}
	
	public static void getCalculate(int a,int b, String operation) {
		
		int result;
		switch(operation) {
		
		case "add":
			result = a+b;
			System.out.println("Addtion of two number is"+result);
			break;
		case "sub":
			result = a-b;
			System.out.println("Substraction of two number is"+result);
		case "mul":
			result = a*b;
			System.out.println("Multiplication of two number is"+result);
		case "div":
			result = a/b;
			System.out.println("Divison of two number is"+result);
		default:
			System.out.println("Not a valid input");
			
		
		}
		
		
		
	}

}

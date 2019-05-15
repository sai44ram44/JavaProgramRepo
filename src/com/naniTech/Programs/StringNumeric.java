package com.naniTech.Programs;

public class StringNumeric {

	public static void main(String[] args) {
		
		
		System.out.println(checkStringNumeric("123Sairamq3242"));
	}
	
	public static String checkStringNumeric(String name) {
		
		String result = "";
		
		boolean value = name.matches("\\d+");
		System.out.println(value);
		
		if(value) {
			result = "Its a number";
		} else {
			
			result = "Its a String";
		}
		
		return result;
	}

}

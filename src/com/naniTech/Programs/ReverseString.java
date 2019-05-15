package com.naniTech.Programs;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "My name is Sairam";
		StringBuffer sb = new StringBuffer(str);
		String reverse = sb.reverse().toString();
		System.out.println(reverse);
		String reverse1 = "";
		for (int i=str.length()-1; i >= 0; i-- ) {
			
			reverse1 = reverse1+str.charAt(i);
		}
		System.out.println(reverse1);
	}

}

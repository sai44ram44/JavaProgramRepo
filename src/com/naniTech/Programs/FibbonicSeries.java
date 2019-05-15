package com.naniTech.Programs;

public class FibbonicSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 1;
		int num = 10;
		while(a < 10) {
		int c = a+b;
		System.out.print(a+"+");
		a = b;
		b = c;
		//a = b;
		}	

	}

}

package com.naniTech.Programs;

public class SumOfNatural {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		sumNatural(arr);
	}
	
	public static void sumNatural(int[] array) {
		
		int len = array.length;
		int firstValue = array[0];
		int lastValue = array[len-1];
		
		int sum = (lastValue*(lastValue+1))/2;
		System.out.println(sum);
	}

}

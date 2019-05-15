package com.naniTech.Programs;

public class LargestOfThree {

	public static void main(String[] args) {
		
		int[] array = {12,3,5,19,89,0,19};
		
		System.out.println(getLargestValue(array));
	}
	
	public static int getLargestValue(int[] arr) {
		
		int max = 0;
		for(int i=0; i < arr.length; i++) {
			
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
		return max;
	}

}

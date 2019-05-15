package com.naniTech.ArrayPrograms;

public class LargestNumberArray {

	public static void main(String[] args) {
		
		int[] arrList = {12,18,199,200,85,9};
		int maxValue=0;

		for(int i=0; i < arrList.length; i++ ) {
			
			if(arrList[i] > maxValue) {
				
				maxValue = arrList[i];
			}
		}
		
		System.out.println(maxValue);
	}

}

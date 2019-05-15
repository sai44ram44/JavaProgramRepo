package com.naniTech.Programs;

public class MissingElement {

	public static void main(String[] args) {
		
		int missElement[] = {45,46,48,49,50};
		int missSum = 0;
		int actualSum = 0;
		
		for(int i=0; i < missElement.length; i++) {
			
			missSum = missSum+missElement[i];
		}
		System.out.println(missSum);
		System.out.println(missElement[missElement.length-1]);
		
		for(int j= missElement[0]; j <= missElement[missElement.length-1]; j++) {
			
			actualSum = actualSum+j;
		}
		System.out.println(actualSum);
		
		System.out.println("Missig Element in the array is "+(actualSum-missSum));
		
		

	}

}

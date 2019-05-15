package com.naniTech.ArrayPrograms;

public class AverageUsingArrays {

	public static void main(String[] args) {
		
		int arrList[] = {12,14,15,19,20};
		int sum=0,avg;
		/*for(int i = 0; i < arrList.length; i++) {
			
			sum = sum+arrList[i];
		}*/
		
		for(int i: arrList) {
			
			sum = sum+i;
		}
		avg = sum/arrList.length;
		System.out.println("Average for given arrayList is :"+avg);

	}
	
	

}

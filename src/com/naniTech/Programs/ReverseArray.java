package com.naniTech.Programs;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arraylist = {1,2,3,4,5,6};
		System.out.println("List of Arrays Before Reversing:");
		for (int i=0; i < arraylist.length; i++) {
			
			System.out.print(arraylist[i]);
		}
		System.out.println("");
		System.out.println("List of Arrays After Reversing:");
		
		
		for (int j=(arraylist.length)-1; j >= 0 ; j--) {
			
			System.out.print(arraylist[j]);
		}

	}

}

package com.naniTech.Programs;

import java.util.ArrayList;
import java.util.List;

public class FactorOfNumber {

	public static void main(String[] args) {
		
		getFactors(60);
		

	}
	
	public static void getFactors(int num) {
		
		List<Integer> factors = new ArrayList();		
		for(int i=1; i <= num; i++) {
			
			if(num%i == 0) {
				factors.add(i);				
			}
			
		}
		
		System.out.println(factors);
	}

}

package com.naniTech.Programs;

import java.util.HashSet;
import java.util.Set;

public class MutilpleStringInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String mulNames[] = {"Sairam","Vamsi","Chinnu","Gopi","Gopi"};
		
		for(int i=0; i < mulNames.length; i++) {
			
			for(int j=i+1; j < mulNames.length; j++) {
				
				if(mulNames[i].equalsIgnoreCase(mulNames[j])) {
					
					System.out.println("Duplicate Array element is :"+mulNames[i]);
				}
			}
		}
		
		
	
	Set<String> sort = new HashSet<String>();
	
	for(String name: mulNames) {
		
		if(sort.add(name) == false) {
			
			System.out.println("Duplicate Array element is :"+name);
		}
	}

	}
}	

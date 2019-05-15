package com.naniTech.Programs;

public class RemoveJunk {

	public static void main(String[] args) {
		
		String junkValue = "&*^*&^*&Sai(*&*( Ram(*&(*&(^ 420((&(*^(^*(&^";
		
		String realValues = junkValue.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(realValues);
		

	}

}

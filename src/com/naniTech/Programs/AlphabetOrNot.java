package com.naniTech.Programs;

public class AlphabetOrNot {

	public static void main(String[] args) {
		
		checkAlphabet('p');

	}
	
	public static void checkAlphabet(char c) {
		
		if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
			
			System.out.println("Charcter is Alphabet");
		} else {
			System.out.println("Charcter is not an Alphabet");
		}
	}

}

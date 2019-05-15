package com.naniTech.Programs;

public class PyramidStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int line = 5;
		int space = line-1;
		int star = 1;
		
		for(int i=1; i <= line; i++) {
			
			for (int j=1; j <= space; j++) {
				
				System.out.print(" ");
			}
			
			for(int k=1; k <= star; k++) {
				System.out.print("* ");
			}
			
			System.out.println("");
			space--;
			star++;
		}
		
		

	}

}

package com.naniTech.Programs;

public class ArmStrongNumberRanges {

	public static void main(String[] args) {
		
		int range1 =1, range2 = 200;
		
		for(int i = range1; i <= range2; i++) {
			
			boolean result = verifyArmstrongNumber(i);
			if(result) {	
				System.out.println(i+" is a ArmStrong Number");
			} else {
				System.out.println(i+ " is not a ArmStong Number");
			}
			
		}

	}
	
	public static boolean verifyArmstrongNumber(int num) {
		
		double armStrong = 0;
		int tempNum = num;
		int rem;
		int numLength = Integer.toString(num).length();
		while(num != 0) {
			
			rem = num%10;
			armStrong = armStrong + Math.pow(rem, numLength);
			num = num/10;
		}
		
		boolean result;
		int armStrong1 = (int)armStrong;
		if(armStrong1 == tempNum) {
			result = true;
		} else {
			result = false;
		}
		
		return result;
	}

}

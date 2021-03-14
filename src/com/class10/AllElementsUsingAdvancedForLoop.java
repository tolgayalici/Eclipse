package com.class10;

public class AllElementsUsingAdvancedForLoop {

	public static void main(String[] args) {
		
		int[] numbers= {10,14,78,5,90};
		// for each, enhanced for loop, advanced for loop
		
		for(int num:numbers) {
			
			System.out.print(num+" ");
			
		}
		System.out.println();
		System.out.println("--------------------------");
		
		
		char[] grades= {'A','B','C','D','E','F','G','H'};
		
		for(char grade:grades) {
			System.out.println(grade);
		}
		
		System.out.println();
		System.out.println("--------------------------");
		
		boolean[] boo= {true,false,false,false,true};
		
		for(boolean b:boo) {
			
			System.out.print(b+" ");
			
		}
		
		
		
	}

}

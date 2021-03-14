package com.class07;

public class Example1 {

	public static void main(String[] args) {
		
		
		/*
		 * Print odd numbers between 20 and 50 (2 ways)
		 */
		
		for(int i=20; i<=50; i++) {
			if(i%2==1) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println("--------------");
		
		for(int i=21; i<=50; i+=2) {
			System.out.print(i+ " ");
		}
		
		System.out.println();
		System.out.println("------WHAT IS THE OUTPUT?-------");
		
		int sum=0;
		
		for(int i=1; i<=5; i++) {
			sum=sum+i;
			System.out.println(sum);
		}
		
		System.out.println("------WHAT IS THE OUTPUT?-------");
		
		int result=0;
		
		for (int i=2; i<10; i+=2) {
			result+=i;
			
			System.out.println(result);
		}
		
		
	}

}

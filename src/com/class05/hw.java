package com.class05;

import java.util.Scanner;

public class hw {

	public static void main(String[] args) {
		
		
		boolean creditCard;
		double balance;
		Scanner scan;
		
		scan=new Scanner(System.in);
		System.out.println("Do you have a credit card?");
		creditCard=scan.nextBoolean();
		
		if (creditCard) {
			System.out.println("What is the balance on the cc?");
			 balance=scan.nextDouble();
			 if (balance>1000) {
				 System.out.println("Pay of immediately");
			 }else {
				 System.out.println("Spend more");
			 }
		}else {
			System.out.println("Would you like a credit card?");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

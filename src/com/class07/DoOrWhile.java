package com.class07;

import java.util.Scanner;

public class DoOrWhile {

	public static void main(String[] args) {
		
		/*
		 * We play lottery we have win number which is 17
		 * we need to keep asking a user to enter any number from 1-100
		 * UNTIL correct number is entered
		 */
		
		Scanner scan;
		int num;
		int lotteryNumber=17;
		
		scan=new Scanner(System.in);
		
		
		
		do {
			System.out.println("Please enter any number from 1-100 to win the lottery");
			num=scan.nextInt();
			
		}while (num!=lotteryNumber);
		
		System.out.println("Congratulations you entered "+num+" which is a lucky number");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

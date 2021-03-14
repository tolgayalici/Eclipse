package com.class05;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		
		
		Scanner pp=new Scanner(System.in);
		int height;
		
		System.out.println("Please enter your height in inches");
		height =pp.nextInt();
		
		if (height <60) {
			System.out.println("Person is short");
		}else if (height >=60 && height <=72) {
			System.out.println("Person is medium");
		}else {
			System.out.println("Person is tall");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

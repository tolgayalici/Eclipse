package com.class06;
import java.util.Scanner;

public class Hw {

	public static void main(String[] args) {

		int num1, num2, num3, largest;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter 3 numbers");
		num1=input.nextInt();
		num2=input.nextInt();
		num3=input.nextInt();
		
		if (num1>num2) { // we assume number1 is bigger than number2
			
			if(num1>num3) {
				largest=num1;
			}else {
				largest=num3;
			}
		}else { // we assume number 2 is bigger than number1
			
			if(num2>num3) {
				largest=num2;
			}else {
				largest=num3;
			}
		}
		
		
		System.out.println("The largest number among "+num1+","+num2+","+num3+", is "+largest);
		
		
		
		
		
		
		
		
		
		
		

	}

}

package com.class03;

public class DoubleComparison {

	public static void main(String[] args) {
		
		double n1=10;
		double n2=15;
		
		if (n1>n2) {
			System.out.println("Double value n1 is larger than n2");
		}else {
			System.out.println("Double value n1 is not larger than n2");
		}
		
		
		int temp=30;
		
		if(temp<32 ) {
			
			System.out.println("I am  if black");
			System.out.println("Water will freeze with temperature "+temp);
			System.out.println("It is very cold");
			
		}else {
			System.out.println("I am else block");
			System.out.println("Water will not freeze with temperature "+temp);
		}
		
		
		double money=5;
		double $coke=3;
		
		if(money==$coke) {
			System.out.println("I am buying soda");
		}else {
			System.out.println("I need exact amount");
		}
		
		boolean snow=true;
		
		if (snow==true) {   // or you can do---> if (snow) because variable is already boolean
			System.out.println("Yay, I will play with the snow");
		}else {
			System.out.println("I am going to ride my bicycle");	
		}
		boolean summer=false;
		if(summer) {
			System.out.println("I am going to Florida");
		}else {
			System.out.println("I will stay at home");
		}
		
		
		
		
		
		
		
		
	}
}
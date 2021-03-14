package com.class08;

public class Hw {

	public static void main(String[] args) {
		
		
		System.out.println("=======One Way--------");
		
		int sumEven=0;
		
		for(int i=0; i<=50; i+=2 ) {
			sumEven+=i;
		}
		System.out.println("The sum of even numbers is "+sumEven);
		
		
		
		int sumOdd=0;
		
		for( int i=1; i<=50; i+=2) {
			sumOdd+=i;
		}
		System.out.println("The sum of odd numbers is "+sumOdd);
		
		System.out.println("=======Preferrable Way--------");
		
		int odd=0;
		int even=0;
		
		for( int i=1; i<=50; i++) {
			if(i%2==0) {
				even+=i;
			}else {
				odd+=i;
			}
		}
		System.out.println("The sum of even numbers is "+odd);
		System.out.println("The sum of odd numbers is "+even);
		
		
		
		
		
		
		
		
		
	}

}

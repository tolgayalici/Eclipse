
public class ArithmeticOperators {

	public static void main(String[] args) {
			
		int num1=10;
		int num2=5;
			
		//    +,   -,   *,   ,/    %,
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
			
		double number1=10.99;
		double number2=90.99;
		
		double somOfDouble=number1+number2;
		double subOfDouble=number1-number2;
		double divOfDouble=number2/number1;
		
		System.out.println("Result of division of 2 double values "+divOfDouble);
		
		float n1=10.99f;
		float n2=90.99f;
		
		float f=n2/n1;
		float f1=n1/n2;
		
		System.out.println("Result of division of 2 float values "+f);
		System.out.println("Result of division of 2 float values "+f1);
		System.out.println("Result of subtraction of 2 double values "+subOfDouble);
		
		//precedence () --->  * & / ---> + & -
		
		int result=10+2*5;
		System.out.println(result);
		int result1=(10+2)*5;
		System.out.println(result1);
		int result2=60-10/5;
		System.out.println(result2);
		
		//modulus operator --->shows remainder of the divison	
		int mod=10%3;
		System.out.println("Remainder is = "+mod);
		
		int mod1=10%2;
		System.out.println("Remainder is = "+mod1);
		
		int mod2=(20%7)*3;
		System.out.println(mod2);
		
		int mod3=(20%7)+5*2;
		System.out.println(mod3);
		
		
		
		
		
		
		
				
		
		
		
		
		
		
		
		
		
		

	}

}

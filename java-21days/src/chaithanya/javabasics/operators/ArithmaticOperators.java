package chaithanya.javabasics.operators;

import java.util.Scanner;

public class ArithmaticOperators {

	public static void main(String[] args) 
	{
		
		// TODO Auto-generated method stub
		double a,b;
		
		System.out.println("Enter the values of a and b");
		Scanner s=new Scanner(System.in);
				a=s.nextInt();
		        b=s.nextInt();
		        System.out.println("the value of a: " +a+ "\n the value of b: "+b);
System.out.println("the sum is: "+(a+b));
System.out.println("the difference is: "+(a-b));
System.out.println("the product is: "+(a*b));
System.out.println("the division is: "+(a/b));
System.out.println("the remainder is: "+(a%b));
	}

}

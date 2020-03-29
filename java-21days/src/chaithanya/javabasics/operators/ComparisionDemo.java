package chaithanya.javabasics.operators;

import java.util.Scanner;

public class ComparisionDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a,b;
		System.out.println("enter the two numbers");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		if(a>b)
		{
			System.out.println(a+" is a greatest number ");
		}
		else
			System.out.println(b+" is a greatest number ");
		

	}

}

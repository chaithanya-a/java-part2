package chaithanya.javabasics.operators;

import java.util.Scanner;

public class ShiftOperatorDemo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a;
		System.out.println("enter the number");
		Scanner s=new Scanner(System.in);
		 a=s.nextInt();
		 System.out.println(a+" after shifting two times to the left is " +(a<<2));
		 System.out.println(a+" after shifting two times to the right is " +(a>>2));

	}

}

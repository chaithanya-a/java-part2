package chaithanya.javabasics.conditions;

import java.util.Scanner;

public class IfDemo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
int a;
System.out.println("enter the numbers\n");
Scanner s=new Scanner(System.in);
a=s.nextInt();
if(a%2==0)
{
System.out.println("The number is even");
}
else
	System.out.println("The number is odd");

	}

}



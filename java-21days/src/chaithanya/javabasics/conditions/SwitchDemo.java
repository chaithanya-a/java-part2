package chaithanya.javabasics.conditions;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter the alphabet of your choice");
		Scanner s = new Scanner(System.in);
		char ch = s.next().charAt(0);
		switch (ch) {
		case 'a':System.out.println(ch+" is a VOWEL");
				break;
		case 'e':System.out.println(ch+" is a VOWEL");
		break;
		case 'i':System.out.println(ch+" is a VOWEL");
		break;
		case 'o':System.out.println(ch+" is a VOWEL");
		break;
		case 'u':System.out.println(ch+" is a VOWEL");
		break;

		default:System.out.println(ch+" is not a VOWEL");
			break;
		}
		

	}

}

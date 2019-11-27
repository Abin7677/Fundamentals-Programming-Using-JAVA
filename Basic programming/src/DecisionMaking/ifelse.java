package DecisionMaking;

import java.util.Scanner;

public class ifelse {
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a age");
		System.out.println();
		int a=s.nextInt();
		if(a>=21)
		{
			System.out.println("The Person can marry and he is" +a);
		}
		else
		{
			System.out.println("The person cant marry and his age is" +a);
		}
	}
}

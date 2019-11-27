package controlstructures;

import java.util.Scanner;

public class numberfibo {
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enetr a count");
		int i=s.nextInt();
		int a=0,b=1,c=0;
		while(c<i)
		{
			c=a+b;
			a=b;
			b=c;
		}
		if(c==i)
		{
			System.out.println("The number is fibonacii");
		}
		else
		{
			System.out.println("The number is not");
		}
		
		}
}

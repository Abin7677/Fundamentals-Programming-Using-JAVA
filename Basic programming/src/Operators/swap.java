package Operators;

import java.util.Scanner;

public class swap {
public static void main(String arg[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enetr a variable");
	int a=s.nextInt();
	System.out.println("Enter a second variable");
	int b=s.nextInt();
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("a="+a);
	System.out.println("b="+b);
	}
}

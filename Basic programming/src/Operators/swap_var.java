package Operators;

import java.util.Scanner;

public class swap_var {
public static void main(String arg[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a variable");
	int a=s.nextInt();
	System.out.println("Enter another variable");
	int b=s.nextInt();
	int c=0;
	c=a;
	a=b;
	b=c;
	System.out.println("Swapped values are");
	System.out.println("a="+a);
	System.out.println("b="+b);
	}
}

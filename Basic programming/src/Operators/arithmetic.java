package Operators;

import java.util.Scanner;

public class arithmetic {

	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter one number");
		int a=s.nextInt();
		System.out.println("Enter another number");
		int b=s.nextInt();
		System.out.println("ADD ="+(a+b));
		System.out.println("SUB ="+(a-b));
		System.out.println("MUL ="+(a*b));
		System.out.println("DIV ="+(a/b));
		System.out.println("MOD ="+(a%b));
	}
}

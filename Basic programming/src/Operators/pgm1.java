package Operators;

import java.util.Scanner;

public class pgm1 {
public static void main(String arg[])
{
	Scanner s= new Scanner(System.in);
	int a=s.nextInt();
	int b=a%10;
	int c=a/10;
	int d=b*c;
	int e=c*c;
	System.out.printf("The output is %d%d",d,e);
	}
}

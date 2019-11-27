package Operators;

import java.util.Scanner;

public class intrest {
public static void main(String arg[])
{
	Scanner s= new Scanner(System.in);
	int p=s.nextInt();
	int n=s.nextInt();
	float r=s.nextFloat();
	float i=(p*n*r)/100;
	System.out.println("Intrest is %.02f ="+i);
	}
}

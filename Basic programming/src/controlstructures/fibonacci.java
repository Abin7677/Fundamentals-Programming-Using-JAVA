package controlstructures;

import java.util.Scanner;

public class fibonacci {
public static void main(String arg[])
{
	//Scanner s=new Scanner(System.in);
	//System.out.println("Enetr a count");
	int a=0,b=1;
	System.out.println("fibonacci series"+10+"numbers:");
	for(int i=0;i<10;i++)
	{
		System.out.printf("%d ",a);
	int	c=a+b;
	a=b;
	b=c;
	}
	
}
}

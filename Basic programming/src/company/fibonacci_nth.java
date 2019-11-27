package company;

import java.util.Scanner;

public class fibonacci_nth {
public static void main(String arg[])
{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int a=0,b=1;
	int c=0;
	System.out.printf("%d %d ",a,b);
	for(int i=0;i<n-2;i++)
	{
		c=a+b;
		System.out.printf("%d ",c);
		a=b;
		b=c;
	}
}
}

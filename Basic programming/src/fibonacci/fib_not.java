package fibonacci;

import java.util.Scanner;

public class fib_not {
public static void main(String arg[])
{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int f1=0;
	int f2=1;
	int f3=0;
	while(f3<n)
	{
		f3=f1+f2;
		f1=f2;
		f2=f3;
	}
	if(n==f3)
	{
		System.out.println("fibonacci");
	}
	else
	{
		System.out.println("Not fibonacci");
	}
}
}

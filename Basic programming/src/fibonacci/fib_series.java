package fibonacci;

import java.util.Scanner;

public class fib_series {
public static void main(String arg[])
{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int f1=0;
	int f2=1;
	int f3=0;
	System.out.printf("%d %d",f1,f2);
	for(int i=1;i<n-1;i++)
	{
		f3=f1+f2;
		System.out.printf(" %d",f3);
		f1=f2;
		f2=f3;
	}
	
}
}

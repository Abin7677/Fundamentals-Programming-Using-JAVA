package company;

import java.util.Scanner;

public class sqrt {
public static void main(String arg[])
{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int temp=n;
	double sqrt=Math.sqrt(n);
	double ans=sqrt*sqrt;
	if(ans==temp)
	{
		System.out.println("perfect squrae");
	}
	else
	{
		System.out.println("not a perfect squrae");
	}
}
}

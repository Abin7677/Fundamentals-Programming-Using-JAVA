package company;

import java.util.Scanner;

public class GCD {
public static void main(String arg[])
{
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int b=s.nextInt();
	int gcd=0;
	int min=(a<b)?a:b;
	for(int i=min;i>0;i--)
	{
		if(a%i==0&&b%i==0)
		{
		    gcd=i;
			break;
		}
	}System.out.println(gcd);
}
}

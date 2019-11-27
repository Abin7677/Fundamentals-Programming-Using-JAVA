package company;

import java.util.Scanner;

public class Strong {
public static void main(String arg[])
{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int i,sum=0,num=n;
	while(n!=0)
	{
		int f=1;
		int r=n%10;
		for(i=1;i<=r;i++)
		{
			f=f*i;
		}
		sum=sum+f;
		n=n/10;
	}
	System.out.println(sum);
}
}

package array;

import java.util.Scanner;

public class compare {
public static void main(String arg[])
{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int[] a=new int[n];
	int[] b=new int[n];
	int i;int flag=0;
	for(i=0;i<n;i++)
	{
		a[i]=s.nextInt();
	}
	for(i=0;i<n;i++)
	{
		b[i]=s.nextInt();
	}
	for(i=0;i<n;i++)
	{
		if(a[i]==b[i])
		{
			flag=1;
		}
		else
		{
		flag=0;
		}
		}
	if(flag==1)
		System.out.println("Yes");
	else
		System.out.println("No");
	}
}

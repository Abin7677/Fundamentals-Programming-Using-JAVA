package company;

import java.util.Scanner;

public class palindrome {
public static void main(String arg[])
{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int temp=n;
	int sum=0;
	while(n!=0)
	{
		int a=n%10;
		sum=(sum*10)+a;
		n=n/10;
	}
	if(temp==sum)
	{
		System.out.println("palindrome");
	}
	else
	{
		System.out.println("not palindrome");
	}
}
}

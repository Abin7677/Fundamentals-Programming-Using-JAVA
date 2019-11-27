package company;

import java.util.Scanner;

public class Sumdigit_single {
public static void main(String arg[])
{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int sum=0;
	int sum1=0;
	while(n!=0)
	{
		int a=n%10;
		sum=sum+a;
		n=n/10;
	}
	while(sum>9)
	{
		int a1=sum%10;
	 sum1 = sum1+a1;
	 sum/=10;
	}
	 System.out.println(sum1+sum);
	//System.out.println(sum);
}}


package company;

import java.util.Scanner;

public class Smallest_number {
public static void main(String arg[])
{
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int b=s.nextInt();
	int c=s.nextInt();
	if(a<b&&a<c)
	{
		System.out.println(a + "is smallest");
	}
	else if(b<c)
	{
	System.out.println(b + "is smallest");	
	}
	else
	{
		System.out.println(c + "is smallest");
	}
}
}

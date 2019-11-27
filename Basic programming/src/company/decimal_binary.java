package company;

import java.util.Scanner;

public class decimal_binary {
public static void main(String arg[])
{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	String x="";
	while(n>0)
	{
		int a=n%2;
		x=a+""+x;
		n=n/2;
	}
	System.out.println(x);
}
}

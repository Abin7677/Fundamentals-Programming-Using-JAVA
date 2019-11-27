package DecisionMaking;

import java.util.Scanner;

public class ifladder {
public static void main(String arg[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter three variables");
	int a=s.nextInt();
	int b=s.nextInt();
	int c=s.nextInt();
	if(a>b&&a>c)
	{
		System.out.println("The largest number is" +a);
	}
	else if(b>c)
	{
		System.out.println("The largest is " +b);
	}
	else
	{
		System.out.println("The larest is " +c);
	}
}
}

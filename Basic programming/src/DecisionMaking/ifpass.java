package DecisionMaking;

import java.util.Scanner;

public class ifpass {
public static void main(String arg[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a age");
	int a=s.nextInt();
	if(a>=21)
	{
		System.out.println("The Person can marry" +a);
	}
}
}

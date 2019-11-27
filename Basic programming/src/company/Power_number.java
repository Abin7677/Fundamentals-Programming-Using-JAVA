package company;

import java.util.Scanner;

public class Power_number {
public static void main(String arg[])
{
	Scanner s=new Scanner(System.in);
	int base=s.nextInt();
	int expo=s.nextInt();
	double result=1;
	while(expo!=0)
	{
		result=result*base;
		expo--;
	}
	System.out.println(result);
}
}

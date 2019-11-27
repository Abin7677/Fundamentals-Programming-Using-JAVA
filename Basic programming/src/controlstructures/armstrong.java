package controlstructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class armstrong {
public static void main(String arg[]) throws NumberFormatException, IOException
{
	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter a number");
	int a=Integer.parseInt(br.readLine());
	int r;
	double sum=0;
	int b=a;
	int c=a;
	int count=0;
	while(c!=0)
	{
		count++;
		c=c/10;
	}
	while(a!=0)
	{
		r=a%10;
		sum=(sum+(Math.pow(r, count)));
		a=a/10;
	}
	System.out.println("Sum ="+sum);
	if(sum==b) {
		System.out.printf("The number is armtrong",+b);
	}
	else
	{
		System.out.printf("The number is not armtrong",+b);
	}
	
}
}

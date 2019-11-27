package company;

import java.util.Scanner;

public class reverse_num {
public static void main(String arg[])
{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int temp=n;
	int rev=0;
	while(n!=0)
	{
		int a=n%10;
		rev=(rev*10)+a;
		n=n/10;
	}
	System.out.printf("Reverse of a number %d:",rev);
}
}

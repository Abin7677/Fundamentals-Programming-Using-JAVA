package patterns;

import java.util.Scanner;

public class csk_p1 {
public static void main(String arg[])
{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<i;j++)
		{
			System.out.print("c");
		}
		for(int j=0;j<i;j++)
		{
			System.out.print("s");
		}
		for(int j=0;j<i;j++)
		{
			System.out.print("k");
		}
		System.out.println();
	}
}
}

package patterns;

import java.util.Scanner;

public class Star_4 {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int n=s.nextInt();
for(int i=1;i<=0;i++)
{
	for(int j=n;j>i;j--)
	{
		System.out.printf(" ");
	}
	for(int k=1;k<=i;k++)
	{
	System.out.println("*");
    }
	System.out.println();
}
	}
	}


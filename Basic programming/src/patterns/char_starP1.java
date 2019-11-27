package patterns;

import java.util.Scanner;

public class char_starP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
for(int i=0;i<n-(n-1);i++)
{
	for(int j=0;j<n;j++)
	{
		System.out.print("c");
	}
	System.out.println();
}
for(int i=1;i<=n;i++)
{
	for(int j=0;j<n;j++)
	{
		if(i==n)
		{
		System.out.print("k");
		}
		else if(j==0||j==(n-1))
		{
			System.out.print("s");
		}else 
		{
			System.out.print("*");
		}
	}
	System.out.println();
}
	}

}

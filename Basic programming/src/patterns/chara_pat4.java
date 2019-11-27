package patterns;

import java.util.Scanner;

public class chara_pat4 {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int n=s.nextInt();
for(int i=0;i<n-4;i++)
{
	for(int j=0;j<n;j++)
	{
		if(i==1&&(j==2||j==3))
		{
		System.out.print("s");
		}else {
			System.out.print("c");
		}
	}
	System.out.println();
}
for(int i=n-4;i<n-2;i++)
{
	for(int j=0;j<n;j++)
	{
		System.out.print("s");
	}
	System.out.println();
}
for(int i=n-2;i<n;i++)
{
	for(int j=0;j<n;j++)
	{
		System.out.print("k");
	}
	System.out.println();
}
	}

}

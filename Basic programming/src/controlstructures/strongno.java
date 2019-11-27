package controlstructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class strongno {
	public static void main(String arg[]) throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a year");
		System.out.println();
		int a=Integer.parseInt(br.readLine());
		int s=0,r;int num=a;
		while(a!=0)
		{
			int f=1;
			r=a%10;
			for(int i=1;i<=r;i++)
			{
				f=f*i;
			}
			s=s+f;
			a=a/10;
		}
		if(num==s)
		{
			System.out.println("Thrnumber is strong");
		}
		else
		{
			System.out.println("Thrnumber is not strong");
		}
}}

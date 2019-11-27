package controlstructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lcf {
	public static void main(String arg[]) throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter two numbers");
		System.out.println();
		int a=Integer.parseInt(br.readLine());
		int b=Integer.parseInt(br.readLine());
		int lcm = 0,hcf = 0;
		int min=(a<b)?a:b;
		for (int i=min;i>0;i--)
		{
			if(a%i==0&b%i==0)
			{
				hcf=i;
				break;
			}	
		}
		System.out.println(hcf);
		int max=(a>b)?a:b;
		for (int i=max; ;i++)
		{
			if(i%a==0&&i%b==0)
			{
				lcm=i;
				break;
			}	
		}
		System.out.println(lcm);
}
}

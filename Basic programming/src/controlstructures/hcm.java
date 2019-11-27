package controlstructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hcm {
	public static void main(String arg[]) throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter two numbers");
		System.out.println();
		int a=Integer.parseInt(br.readLine());
		int b=Integer.parseInt(br.readLine());
		int x = 0,y = 0,lcm,hcf,t;
		a=x;
		b=y;
		while(b!=0)
		{
			t=b;
			b=a%b;
			a=t;
		}
		hcf=a;
		lcm=(x*y)/hcf;
		System.out.println(lcm);
		System.out.println(hcf);
	}
}

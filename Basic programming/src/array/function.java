package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class function {
	public static void main(String arg[]) throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter size of arrays");
		int size=Integer.parseInt(br.readLine());
		int[] a=new int[size];
		int m=0;int i;int d=0;
		int sum=0;
		System.out.println("Enter the array");
		for(i=0;i<size;i++)
		{
		a[i]=Integer.parseInt(br.readLine());
		}
		for(i=0;i<size;i++)
		{
			if(a[i]%2==0)
			{
				d=0;
			}
			else if(a[i]%2!=0)
			{
				d=1;
			}
			else if((a[i]%2==0)&&a[i]!=0)
			{
				d=2;
			}
			else
			{
				d=3;}
		}
			
			if(d==0)
			{
				System.out.println("The array is Even");
			}
			else if(d==2)
			{
				System.out.println("The array is Odd");
			}
			else if(d==1)
			{
				System.out.println("The array is Mixed");
				}
			else
			{
				System.out.println("No");
			}
}
}

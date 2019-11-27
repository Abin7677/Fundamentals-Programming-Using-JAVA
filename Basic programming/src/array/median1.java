package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class median1 {
	public static void main(String arg[]) throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter size of arrays");
		int n=Integer.parseInt(br.readLine());
		int[] a=new int[n];
		int m=0;int i=0,f=0;
		double md=0,md1=0;
		System.out.println("Enter the array");
		for(i=0;i<n;i++)
		{
		a[i]=Integer.parseInt(br.readLine());
		}
	for(i=0;i<n;i++)
	{
	        Arrays.sort(a);
	        if (n% 2 != 0) 
	        {
	         md = a[n/2];
	        f=1;
	        }
	    else
	    {
	      md1=(a[(n-1)/2] + a[n/2])/2;
	      f=0;
	      }
	      }
	  if(f==1)
	  System.out.printf("The median of the array is %.2f",md);
	  else
	  System.out.printf("The median of the array is %.2f",md1); 
}
}

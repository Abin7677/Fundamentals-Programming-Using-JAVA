package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class largestno {
	public static void main(String arg[]) throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter size of arrays");
		int size=Integer.parseInt(br.readLine());
		int[] a=new int[size];
		int m=0;int i=0;
		System.out.println("Enter the array");
		for(i=0;i<size;i++)
		{
		a[i]=Integer.parseInt(br.readLine());
		}
		for(i=0;i<size;i++)
		{
			if(a[i]>=m)
			{
				m=a[i];
			}
			
		}
		System.out.println("largest = ");
		System.out.println(m);
		
	}
}


package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class secondlar {
	public static void main(String arg[]) throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter size of arrays");
		int size=Integer.parseInt(br.readLine());
		int[] a=new int[size];
		//int m=0,n=0;
		int i=0;
		System.out.println("Enter the array");
		for(i=0;i<size;i++)
		{
		a[i]=Integer.parseInt(br.readLine());
		}
		Arrays.sort(a);
		System.out.println(a[size-2]);
	}
}

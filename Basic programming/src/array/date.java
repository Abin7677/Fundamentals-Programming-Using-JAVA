package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class date {
	public static void main(String arg[]) throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string");
		System.out.println();
		int size=Integer.parseInt(br.readLine());
		String a[]=new String[size];
		for(int i = 0;i<size;i++)
		{
			a[i]=br.readLine();
		}
		for (int i=0;i<size;i++)
		{
			char c;
			c=a[i].charAt(3);
			
		}
}
}

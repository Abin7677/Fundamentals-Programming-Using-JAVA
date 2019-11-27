package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class add {
public static void main(String arg[]) throws NumberFormatException, IOException
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter size of arrays");
	int size=Integer.parseInt(br.readLine());
	int[] a=new int[size];
	int[] b=new int[size];
	//int[] c=new int[size];
for(int i=0;i<size;i++)
{
	System.out.println("Enter 1 arrays");
	a[i]=Integer.parseInt(br.readLine());
}
for(int i=0;i<size;i++)
{
	System.out.println("Enter 2 arrays");
	b[i]=Integer.parseInt(br.readLine());
}
for(int i=0;i<size;i++)
{
	System.out.println(a[i]+b[i]);
}}
}



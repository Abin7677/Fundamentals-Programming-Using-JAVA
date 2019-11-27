package array;

import java.util.Arrays;
import java.util.Scanner;

public class duplicates {
public static void main(String arg[])
{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int a[]=new int[n];
	int i=0;
	for(i=0;i<n;i++)
	{
		a[i]=s.nextInt();
	}
	Arrays.sort(a);
	a[i]=removeAll(a,n);
}

private static int removeAll(int[] a, int n) {
	// TODO Auto-generated method stub
	return 0;
}
}

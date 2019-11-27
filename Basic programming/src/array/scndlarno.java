package array;
import java.util.Arrays;
import java.util.Scanner;

public class scndlarno {
public static void main(String arg[])
{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int a[]=new int[n];
	int i;
	for(i=0;i<n;i++)
	{
		a[i]=s.nextInt();
	}
	Arrays.sort(a);
	System.out.println(a[n-2]);
}
}

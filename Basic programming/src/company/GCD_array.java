package company;

import java.util.Scanner;

public class GCD_array {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
	a[i]=s.nextInt();
}
int result=a[0];
for(int i=1;i<n;i++)
{
	if(a[i]%result!=0) {
		result=a[i]%result;
	}
	
}
System.out.println(result);
	}

}

package company;

import java.util.Scanner;

public class Index_elmnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
	a[i]=s.nextInt();
}
int k=s.nextInt();

if(k>=n)
{
	System.out.println("-1");

	}
else {
	System.out.println(a[k]);
	}
	}
}
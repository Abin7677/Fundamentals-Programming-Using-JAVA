package company;

import java.util.Scanner;

public class Segrigat_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
int i=0;
for(i=0;i<n;i++)
{
	a[i]=s.nextInt();
}
int count=0;
for(i=0;i<n;i++)
{
	if(a[i]==0)
	{
		count++;
	}
}
for(i=0;i<count;i++)	
{
	a[i]=0;
	System.out.print(a[i]+" ");
	}
for(i=count;i<n;i++)
{
	a[i]=1;
	System.out.print(a[i]+" ");
	}
}
}

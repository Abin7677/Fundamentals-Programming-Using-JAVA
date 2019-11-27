package company;

import java.util.Scanner;

public class Unique_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
//int result=0;
for(int i=0;i<n;i++)
{
	a[i]=s.nextInt();
}
for(int i=0;i<n;i++)
{
	int j=0;
	for( j=0;j<i;j++)
	
		if(a[i]==a[j])
		
			break;
		
		if(i==j)
		
	System.out.print(a[i]+" ");
		
	}

	}

}

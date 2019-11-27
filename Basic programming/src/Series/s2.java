package Series;

import java.util.Scanner;

public class s2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a=0;
int b=0;
int c=2;
int d=0;
System.out.printf("%d %d %d ",a,b,c);
for(int i=1;i<n;i++)
{
	if(i%2!=0)
	{
		 d=c/2;
		System.out.printf("%d ", d );
	}
	else
	{
		d=c+2;
		System.out.printf("%d ", d);
		c=d;
	}
	
}
	}

}

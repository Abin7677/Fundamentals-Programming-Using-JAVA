package prime;

import java.util.Scanner;

public class prime_div {
public static void main(String arg[])
{
	Scanner s=new Scanner(System.in);
int n=s.nextInt();
int i,j;
int c=0;
for(i=2;i<=n;i++)
	{
	for(j=3;j<=i;j++)
		{
			if(i%j==0||(i+2)%j==0)
			{
				c++;
				break;  
			}
		}
if(c==1)
{
	System.out.println("("+i+","+(i+2)+") ");
}
}
}
}
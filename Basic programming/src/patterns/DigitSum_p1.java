package patterns;

import java.util.Scanner;

public class DigitSum_p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int c=1;
for(int i=1;i<=n;i++)
{
	for(int j=1;j<=i;j++)
	{
		System.out.print(j);
	}
	//c++;
	System.out.println();
}
for (int i=1;i<=n;i++) 
{
    for (int j=i; j>=1; j--)
    {
        System.out.print(j);
    }
     
    System.out.println();
}
 
	}

}

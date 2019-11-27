package patterns;

import java.util.Scanner;

public class Hash_p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
for(int i=0;i<n;i++)
{
	for(int j=0;j<=n*2;j++)
	{
		if((i+j)==5||(j-i)==5)
		{
		System.out.print("*");
		}
		else
		{
			System.out.print("#");
		}
	}
	System.out.println();
}
	}

}

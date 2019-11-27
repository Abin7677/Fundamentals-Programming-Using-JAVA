package patterns;

import java.util.Scanner;

public class Star_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);//for user give input through keyboard
int number =s.nextInt();//user allocates how many patterns
int n=number;
for(int i=0;i<=n;i++)
{
	for(int j=n;j>=i;j--)
	{
		System.out.printf("*");
	}
	System.out.println();
}
	}

}

package company;

import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int temp=n;
		int sum=0;
		while(n!=0)
		{
			int a=n%10;
			sum=sum+(a*a*a);
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("armstrong");
		}
		else
		{
			System.out.println("not armstrong");
		}
	}

}

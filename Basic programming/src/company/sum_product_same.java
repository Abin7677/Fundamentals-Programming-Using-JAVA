package company;

import java.util.Scanner;

public class sum_product_same {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum=0;
		int sum1=1;
		while(n!=0)
		{
			int a=n%10;
			sum = sum+a;
			n=n/10;
			
		}
		while(n>0)
		{
			int a1=n%10;
			sum1=sum1*a1;
			n=n/10;
		}
		if(sum==sum1)
		{
			System.out.println("Sum an product are same");
		}else
		{
			System.out.println("Sum and Product are not same");
		}
			
	}

}

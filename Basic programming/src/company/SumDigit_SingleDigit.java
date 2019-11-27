package company;

import java.util.Scanner;

public class SumDigit_SingleDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);	
int n=s.nextInt();
int sum=0;
while(n>0||sum>9)
{
	if(n==0)
	{
		n=sum;
		sum=0;
	}
	int a=n%10;
	sum=sum+a;
	n=n/10;
}
System.out.println(sum);
	}

}

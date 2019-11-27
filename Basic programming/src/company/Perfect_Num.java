package company;

import java.util.Scanner;

public class Perfect_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int temp=n;
int sum=0;
for(int i=1;i<n;i++)
{
	if(n%i==0)
	{
		sum=sum+i;
	}
}
if(sum==temp)
{
	System.out.println("Perfect");
}
else
{
	System.out.println("Not Perfect");
}
	}

}

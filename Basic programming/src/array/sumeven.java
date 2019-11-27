package array;

import java.util.Scanner;

public class sumeven {
	public static void main(String args[])
	  {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int[] a=new int[n];
	    int i,sum=0,sum1=0;
	    for(i=0;i<n;i++)
	    {
	    	a[i]=s.nextInt();
	    }
	    for(i=0;i<n;i++) {
	    	if(a[i]%2==0)
	    	{
	    		sum=sum+a[i];
	    	}
	    	else
	    	{
	    		sum1=sum1+a[i];
	    	}
	    	}
	    		    System.out.println("The sum of the even numbers in the array is " +sum);
	    		    System.out.println("The sum of the odd numbers in the array is "+sum1);

	  }
}

package array;

import java.util.Scanner;

public class sum_max_min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s=new Scanner(System.in);
		  int n=s.nextInt();
		  int a[]=new int[n];
		  int sum=0;
		  int max=0,min=100,d=0;
		  for(int i=0;i<n;i++)
		  {
			  a[i]=s.nextInt();
		  }
		  for(int i=0;i<n;i++)
		  {
			  sum=sum+a[i];
		  }
		  for(int i=0;i<n-1;i++)
		  {
			  if(a[i]>max);
			  {
				  max=a[i];
			  }
		  }
		  for(int i=0;i<n;i++)
		  {
			  if(a[i]<min)
			  {
				  min=a[i];
			  }
		  }
		  d=max-min;
		  System.out.println("Sum: "+sum);
		  System.out.println("Largest element: "+max);
		  System.out.println("Smallest element: "+min);
		  System.out.println("Difference of l and s: "+d);
	}

}

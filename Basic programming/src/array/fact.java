package array;

import java.util.Scanner;

public class fact {
public static void main(String arg[])
{
	
	     Scanner s=new Scanner(System.in);
	      int n=s.nextInt();
	      int f=1;
	      for(int i=1;i<=n/2;i++)
	      {
	        f=f*i;
	      if(f==n)
	      {
	        System.out.println("Yes");
	      break;}
	      }
	      if(f!=n){
	        System.out.println("No");
	      }
	      
	 
}
}

package array;

import java.util.Scanner;

public class p10 {
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int i,j;
      for(i=0;i<=n;i++)
        {
         for(j=0;j<=n;j++)
         {
           if(i%2==0)
           {
             if(j==0)
               System.out.print(i+1);
               else
                 System.out.print(i);
           }
           else
           {
             if(j==n)
               System.out.print(i+1);
               else
                 System.out.print(i);
           }
         }
         System.out.println();
      }
     
	}
}

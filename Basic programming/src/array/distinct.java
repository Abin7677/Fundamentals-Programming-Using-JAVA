package array;

import java.util.Scanner;

public class distinct {
public static void main(String arg[])
{
	   Scanner s=new Scanner(System.in);
	   int a=s.nextInt();
	   int b[]=new int[a];
	   int c=0,i,j;
	   for(i=0;i<a;i++)
	   {
	     b[i]=s.nextInt();
	     
	   }
	    for(i=0;i<a;i++)
	   {
	     for(j=0;j<a;j++)
	    if(b[i]==b[j])
	    {
	      break;
	     }
	      if(i==j)
	        c++;
	   }
	    System.out.println(c);
	   }
	 }

package array;

import java.util.Scanner;

public class p9 {
	public static void main(String args[])
	{
	      Scanner s=new Scanner(System.in);
	        int num =s.nextInt();
	        int space;
	 
	        int i, j, lterm, rterm;
	 
	        lterm = 1;
	        rterm = num * num + 1;  
	 
	        for (i = num; i > 0; i--) 
	        {
	 
	            // To print number of spaces  
	            for (space = num; space > i; space--)          
	                System.out.print(" ");
	 
	            for (j = 1; j <= i; j++)
	            {
	                System.out.print(lterm);
	                System.out.print("*");
	                lterm++;
	            }
	            for (j = 1; j <= i; j++)
	            {
	                System.out.print(rterm);
	                if (j < i)
	                    System.out.print("*");
	                rterm++;
	            }
	 
	            rterm = rterm - (i - 1) * 2 - 1;  
	            System.out.println();
	        }
	    }
	} 



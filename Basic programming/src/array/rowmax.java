package array;

import java.util.Scanner;

public class rowmax {
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	     int r=s.nextInt();
	     int c=s.nextInt();
	     int m[][]=new int[r][c];
	     int res[]=new int[r];
	     int c1=0,i,j;
	     for(i=0;i<r;i++){
	       for(j=0;j<c;j++){
	         m[i][j]=s.nextInt();
	       }
	     }
	     for(i=0;i<r;i++)
	     {
	     for (j=0;j<r; j++)               //<m[i].length
	     {
	       if (m[i][j] > c1)
	       {
	          c1 = m[i][j];
	        }
	       }
	           res[i] = c1;
	           c1 =0;
	       
	     
	   }
	       for ( i =0;i<res.length;i++) {
	           System.out.println(res[i]);
	       }
	 
	   }
}

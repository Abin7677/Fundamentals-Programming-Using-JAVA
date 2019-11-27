package array;

import java.util.Scanner;

public class search {
	public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int[] a=new int[n];
      int i,search;
      for(i=0;i<n;i++)
      {
        a[i]=s.nextInt();
      }
      search=s.nextInt();
      for(i=0;i<n;i++)
      {
    	  if(a[i]==search)
    	  {
    		  System.out.printf(search +" is present in the array");
    		  break;
    	  }
    		  else
    		  {
    			  System.out.printf(search+" is not present in the array");
    			  break;
    		  }
    	  }
      }
}

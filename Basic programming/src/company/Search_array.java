package company;

import java.util.Scanner;

public class Search_array {
	public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int[] a=new int[n];
      int i,search,flag=0;
      for(i=0;i<n;i++)
      {
        a[i]=s.nextInt();
      }
      search=s.nextInt();
      for(i = 0; i < n; i++)
      {
          if(a[i] == search)
          {
              flag = 1;
              break;
          }
          else
          {
              flag = 0;
          }
      }
      if(flag == 1)
      {
         System.out.println("Element is in the array");
      }
      else
      {
          System.out.println("Element not found");
      }
    }  
}

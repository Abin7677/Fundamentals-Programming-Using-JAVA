package array;

import java.util.Arrays;
import java.util.Scanner;

public class sort {
	public static void main(String [] args)
	  {
	    Scanner s=new Scanner(System.in);
		  int n=s.nextInt();
		  String a[]=new String[n];
		  n = a.length;

	      for(int i = 0; i<n-1; i++) {
	         for (int j = i+1; j<a.length; j++) {
	            if(a[i].compareTo(a[j])>0) {
	               String temp = a[i];
	               a[i] = a[j];
	               a[j] = temp;
	            }
	         }
	      }
	      for(int i=0;i<n;i++)
	      {
	      System.out.println(a[i]);
	  }}
}

package company;

import java.util.Scanner;

public class binaryToDecimal {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int r,d=0,p=0;
		while(n!=0)
		{
			r=n%10;
			n=n/10;
			d+=d+r*Math.pow(2, p);
			
			p++;
		}
		System.out.println(d);
	}
}

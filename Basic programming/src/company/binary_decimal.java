package company;

import java.util.Scanner;

public class binary_decimal {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int r,d=0,p=1;
		while(n!=0)
		{
			r=n%10;
			d=d+r*p;
			p=p*2;
			n=n/10;
		}
		System.out.println(d);
	}

}

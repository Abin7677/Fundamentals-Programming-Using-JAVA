package company;

import java.util.Scanner;

public class arc_circle {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		int r=s.nextInt();
		double c=s.nextDouble();
		double a=2*3.14*r*(c/360);
		System.out.println(a);
	}
}

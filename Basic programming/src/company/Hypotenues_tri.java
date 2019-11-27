package company;

import java.util.Scanner;

public class Hypotenues_tri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int l=s.nextInt();
int b=s.nextInt();
double h=(l*l)+(b*b);
h=Math.sqrt(h);
System.out.println(h);
	}

}

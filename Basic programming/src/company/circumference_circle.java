package company;

import java.util.Scanner;

public class circumference_circle {
public static void main(String arg[])
{
	Scanner s=new Scanner(System.in);
	int r=s.nextInt();
	double circum=Math.PI*2*r;
	System.out.println(circum);	
}
}

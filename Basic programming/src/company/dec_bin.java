package company;

import java.util.Scanner;

public class dec_bin {
public static void main(String arg[])
{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	String bin=Integer.toBinaryString(n);
	System.out.println(bin);
}
}

package string;

import java.util.Scanner;

public class replace_char {
public static void main(String arg[])
{
	Scanner s=new Scanner(System.in);
	String s1=s.next();
	String s2=s1.replace("l","*");
	System.out.println(s2);
}
}

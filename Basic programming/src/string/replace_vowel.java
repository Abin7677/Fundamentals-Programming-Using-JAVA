package string;

import java.util.Scanner;

public class replace_vowel {
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		String s2=s1.replaceAll("[aeiouAEIOU]","*");
		System.out.println(s2);
	}
}

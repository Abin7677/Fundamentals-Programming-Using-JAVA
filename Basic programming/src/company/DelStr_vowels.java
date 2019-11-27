package company;

import java.util.Scanner;

public class DelStr_vowels {
public static void main(String arg[])
{
	Scanner s=new Scanner(System.in);
	String st=s.next();
	String str=st.replaceAll("[aeiouAEIOU]","");
	System.out.println(str);
}
}

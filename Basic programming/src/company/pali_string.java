package company;

import java.util.Scanner;

public class pali_string {
public static void main(String arg[])
{
	Scanner s=new Scanner(System.in);
	String st=s.next();
	int len=st.length();
	String rev="";
	for(int i=len-1;i>=0;i--)
	{
		rev=rev+st.charAt(i);
	}
	if(st.contentEquals(rev))
	{
	System.out.println("Palindrome");
	}
	else
	{
		System.out.println("not palindrome");
	}
}
}

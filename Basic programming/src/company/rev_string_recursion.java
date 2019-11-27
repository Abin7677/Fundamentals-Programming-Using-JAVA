package company;

import java.util.Scanner;

public class rev_string_recursion {
public static void main(String arg[])
{
	Scanner s=new Scanner(System.in);
	String st=s.next();
	String rev=reverseString(st);
	System.out.println("Reverse is : "+(rev) );
} 
public static String reverseString(String st) {
	if(st.isEmpty())
		return st;
	else 
	 return reverseString(st.substring(1)) + st.charAt(0);
}

}

package company;

import java.util.Scanner;

public class Cipher_char {
public static void main(String arg[])
{
	Scanner s=new Scanner(System.in);
	String c=s.nextLine();
    int a=s.nextInt();
    char ch=0;
    for(int i=0;i<1;i++)
    {
    ch=(char) (c.charAt(0)+a);
    System.out.print(ch);
    
    }
}
}

package string;

import java.util.Arrays;
import java.util.Scanner;

public class String_exchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter a String");
String st=s.next();
System.out.println("Enter the number of days");
int d=s.nextInt();
System.out.println("Enter the position to start the transformation");
int pos=s.nextInt();
int l=st.length();
char a[]=st.toCharArray();
int end=l-pos+1;
char temp;
int l1=end-pos;
for (int i = pos; i < l; i++) 
{
	temp = a[i];
    a[i] = a[l - 2 - i];
    a[l - 2 - i] =temp;
}
System.out.println("revised array : "+Arrays.toString(a));
	}

}

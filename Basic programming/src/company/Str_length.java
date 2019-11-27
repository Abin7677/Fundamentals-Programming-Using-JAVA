package company;

import java.util.Scanner;

public class Str_length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String st=s.next();
int i=0;
char ch[]=st.toCharArray();
for(char c:ch)
{
	i++;
}
System.out.println(i);
	}

}

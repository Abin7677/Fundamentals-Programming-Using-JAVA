package company;

import java.util.Scanner;

public class Vowel_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String st=s.next();
int vowels = 0;
for(int i = 0; i < st.length(); ++i)
{
    char ch = st.charAt(i);
    if(ch == 'a' || ch == 'e' || ch == 'i'
        || ch == 'o' || ch == 'u')
    {
        ++vowels;
    }
	}
System.out.println(vowels);
	}
}


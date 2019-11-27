package company;

import java.util.Scanner;

public class Count_All {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String st=s.nextLine();
int vowels=0,digits=0,consonants=0,spaces=0;
for(int i = 0; i < st.length(); ++i)
{
    char ch = st.charAt(i);
    if(ch == 'a' || ch == 'e' || ch == 'i'
        || ch == 'o' || ch == 'u') {
        ++vowels;
    }
    else if((ch >= 'a'&& ch <= 'z')) {
        ++consonants;
    }
    else if( ch >= '0' && ch <= '9')
    {
        ++digits;
    }
    else if (ch ==' ')
    {
        ++spaces;
    }
}
System.out.println("Vowels: " + vowels);
System.out.println("Consonants: " + consonants);
System.out.println("Digits: " + digits);
System.out.println("White spaces: " + spaces);

	}

}

package company;

import java.util.Scanner;

public class String_conve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String st=s.next();
String st1=s.next();
String st2=s.next();
char[] c1 =st.toCharArray();
for (int i=0; i<st.length();i++) {

    if (c1[i]=='a'||c1[i]=='e'||c1[i]=='i'||c1[i]=='o'||c1[i]=='u'||c1[i]=='A'||c1[i]=='E'||c1[i]=='I'||c1[i]=='O'||c1[i]=='U')
    {
    c1[i]='$';
    }
    else
    	c1[i]=c1[i];   
}
char[] c =st1.toCharArray();
for (int i=0; i<st1.length();i++) {

    if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o'|| c[i] == 'u'||c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U')
    {
        c[i]=c[i];
    }
    else
    {
    	c[i]='#';
    }
}
String str1 = new String(c1);
String str2 = new String(c);
String st3=st2.toUpperCase();
String stri=str1.concat(str2);
String string=stri.concat(st3);
System.out.println(string);
	}
}

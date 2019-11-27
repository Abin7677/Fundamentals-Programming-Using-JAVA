package company;

import java.util.Scanner;

public class Frequency_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String st=s.next();
int len=st.length();
int a[]=new int[len];
int i,j;
char st1[] = st.toCharArray();  

for(i = 0; i <len; i++) {  
    a[i] = 1;  
    for(j = i+1; j <len; j++) {  
        if(st1[i] == st1[j]) {  
            a[i]++;  

            st1[j] = '0';  
        }  
    }  
}  
for(i = 0; i <len; i++) 
{  
    if(st1[i] != ' ' && st1[i] != '0')  
    	
        System.out.println(st1[i] + "=" + a[i]);  
}  

}}

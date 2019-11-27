import java.util.Arrays;
import java.util.Scanner;

public class frequency {
public static void main(String arg[])
{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	String st[]=new String[n];
	String temp;
	int count=0;
	int i,j;
	int length=st.length;
	Arrays.sort(st);
	
	for (i = 0; i < length; i++) 
    {
        for (j = i + 1; j < count; j++) { 
            if (st[i].compareTo(st[j])>0) 
            {
                temp = st[i];
                st[i] = st[j];
                st[j] = temp;
            }
        }
    }
    
}
}

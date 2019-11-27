package Series;

import java.util.Scanner;

public class s1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a=1;

double b=2.0;
System.out.printf("%d %.1f ",a,b);
for(int i=2;i<n;i=+2)
{
 
   double c=(b*b)-i;
   System.out.printf("%.1f ",c);
   b++;
}
	}

}

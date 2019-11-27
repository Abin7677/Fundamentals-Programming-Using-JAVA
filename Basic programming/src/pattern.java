import java.util.Scanner;

public class pattern {
public static void main(String arg[])
{
 Scanner s=new Scanner(System.in);
 int a=s.nextInt();
 int b=s.nextInt();
 int c=s.nextInt();
 int z=0;
 for(int i=0;i<=a;i++)
 {
	 z=((b+c)*a)/2;
	 
 }
 System.out.println(z);
}
}

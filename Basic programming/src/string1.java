import java.util.Scanner;

public class string1 {
public static void main(String arg[])
{
	Scanner s=new Scanner(System.in);
	char st=s.next().charAt(0);
	int n=s.nextInt();
	for(int i=0;i<n;i++)
	{
		if(st=='A'||st=='a'||st=='E'||st=='e'||st=='I'||st=='i'||st=='O'||st=='o'||st=='U'||st=='u')
		{
			System.out.println("*");
		}
	}
}
}

     
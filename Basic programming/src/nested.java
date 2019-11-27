import java.util.Scanner;

public class nested {
public static void main(String arg[])
{
	String s1= "HP";int RAM = 16,HD=2;
	Scanner s=new Scanner(System.in);
	System.out.println("Enetr the values");
	String a=s.next();
	int b=s.nextInt();
	int c=s.nextInt();
	if(a.equals("HP"))
	{
		if(b==RAM)
		{
		    if(c==HD)
		    {
		    	System.out.printf("All are satisfied" +a,+b,+c);
		    }
		    else {
		    	System.out.println("None of these satisfied");
		    }
		}
		 else
		    {
		    	System.out.println("Not a 16 gb");
		    }
	}
	else {
		System.out.println("Not a hp lap ");
		}
	}
}

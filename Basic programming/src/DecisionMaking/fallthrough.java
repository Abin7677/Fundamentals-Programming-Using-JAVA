package DecisionMaking;

import java.util.Scanner;

public class fallthrough {
public static void main(String arg[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a number");
	int i=s.nextInt();
	int m=i%10;
	int n=i/10;
	int t=0;
	if(n!=1)
	{
	switch(m)
	{
	case 1:
	case 2:
	case 6:t=t+3;
	//System.out.println(t);
	//System.out.println("");
	break;
	case 4:
	case 5:
	case 9:t=t+4;
	//System.out.println(t);
	//System.out.println("");
	break;
	case 3:
	case 7:
	case 8:t=t+5;
		//System.out.println(t);
		//System.out.println("");
		break;
	}
	switch(n)
	{
	case 2:
	case 3:t=t+2;
	//System.out.println(t);
	//System.out.printf("The value is",+t);
	//System.out.println("");
	break;
	}
	}
	else
	{
	switch(m)
	{
	case 1:
	case 2:t=t+6;
	//System.out.println(t);
	//.out.println("");
	break;
	case 3:
	case 5:
	case 6:t=t+7;
	
	break;
	case 4:
	case 8:
	case 9:t=t+8;
	
	break;
	case 7:t=t+9;
	
	break;
		
		
}
	}
	System.out.println(t);

}}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dowhile {
public static void main(String arg[]) throws NumberFormatException, IOException
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter a number");
	int a=Integer.parseInt(br.readLine());
	
	int sum=0;
	do {
		
		if(a>0)
		{
			sum=sum+a;
		}
	}while(a>0);
	
		System.out.printf("sum=",+sum);
	
}
}

package DecisionMaking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lpyear {
	public static void main(String arg[]) throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a year");
		System.out.println();
		int y=Integer.parseInt(br.readLine());
		if(y%4==0)
		{
			if(y%100==0)
			{
				if(y%400==0)
				{
					System.out.println("the year is leap year =:"+y);
				}
				else
				{
					System.out.println("the year is not aleap year =:"+y);
				}
			}
				else
				{
					System.out.println("the year is leapyear =:"+y);	
				}
		}
			else
			{
				System.out.println("the year is not a leapyear =:"+y);
			}
		}
}
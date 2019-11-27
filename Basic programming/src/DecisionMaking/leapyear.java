package DecisionMaking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

public class leapyear {
	public static void main(String arg[]) throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a year");
		System.out.println();
		int y=Integer.parseInt(br.readLine());
		if(y%4==0)
		{
			System.out.printf("The year is leap year =:" +y);
		}
		else
		{
			System.out.println("The year is not a leap year =:" +y);
		}
	}
	
}

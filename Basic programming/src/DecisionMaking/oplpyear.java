package DecisionMaking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class oplpyear {
	public static void main(String arg[]) throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a year");
		System.out.println();
		int y=Integer.parseInt(br.readLine());
		if((y%4==0&&y%100!=0)||(y%400==0)) {

				System.out.printf("leap=:"+y);
			}
			else
			{
				System.out.println("not leap=:"+y);
			}
			}
}




















































































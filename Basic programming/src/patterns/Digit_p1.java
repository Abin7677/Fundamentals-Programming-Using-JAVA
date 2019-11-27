package patterns;

import java.util.Scanner;

public class Digit_p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int count=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j)
				{
					System.out.print("0");
				}
				else
				{
					System.out.print(count);
				}
				
			}
			count++;
			System.out.println();
		}
	}

}

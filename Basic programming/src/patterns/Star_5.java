package patterns;

import java.util.Scanner;

public class Star_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<(2*i)+3;j++)
			{
				if(j==(i+1))
						{
				System.out.print(" ");
			}
				else
				{
					System.out.print("*");
				}
			
		}
			System.out.println();
			}
	}

}

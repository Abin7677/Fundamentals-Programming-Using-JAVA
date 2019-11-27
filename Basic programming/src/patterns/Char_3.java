package patterns;

import java.util.Scanner;

public class Char_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int count=65;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.printf("%c",count);
				count++;
			}
			System.out.println();
		}
	}

}

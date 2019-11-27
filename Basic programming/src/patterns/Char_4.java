package patterns;

import java.util.Scanner;

public class Char_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		//int count=68;
		for(int i=n;i>=1;i--)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.printf("%c",64+j);
				//count++;
			}
			System.out.println();
		}
	}

}

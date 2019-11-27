package patterns;

import java.util.Scanner;

public class Star_Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int i,j,k;
for ( i= 0; i<= n-1 ; i++)
{
    for ( j=n-1; j>=i; j--)
    {
        System.out.print(" ");
    }
    for ( k=0; k<=i; k=+2)
    {
        System.out.print("*" + " ");
    }
    System.out.println("");
}
for ( i= 0; i<= n-1 ; i++)
{
    for ( j=-1; j<=i; j++)
    {
        System.out.print(" ");
    }
    for ( k=0; k<=n-2-i; k=+2)
    {
        System.out.print("*" + " ");
    }
    System.out.println("");
}
	}

}

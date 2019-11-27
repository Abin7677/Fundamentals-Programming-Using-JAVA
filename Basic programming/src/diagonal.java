import java.util.Scanner;

public class diagonal {
public static void main(String arg[])
{
	Scanner s=new Scanner(System.in);
	int m=s.nextInt();
	int n=s.nextInt();
	int a[][]=new int[m][n];
	int i,j;int flag=0;
	for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		{
			a[i][j]=s.nextInt();
		}
	}
	for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		{
			if(i!=j)
			{
				if(a[i][j]==0)
				{
					flag=0;
				}
				else
				{
				}flag=1;
			}
		}
		
	}
	if(flag==0)
	{
		System.out.println("Yes");
	}
	else
	{
		System.out.println("No");
	}
}
}

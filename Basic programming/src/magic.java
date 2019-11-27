import java.util.Scanner;

public class magic {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	int m=s.nextInt();
	//int n=s.nextInt();
	int a[][]=new int[m][m];
	int i,j,flag=0;
	int sum=0,sum1=0,sum2=0;
	for(i=0;i<m;i++)
	{
		for(j=0;j<m;j++)
		{
			a[i][j]=s.nextInt();
		}
	}
	for(i=0;i<m;i++)
	{
		for(j=0;j<m;j++)
		{
			if(i==j)
			{
			sum=sum+a[i][j];
			}
		}
	}

	for(i=0;i<m;i++)
	{
		for(j=0;j<m;j++)
		{
			sum1=sum1+a[i][j];
		}
		if(sum==sum1)
		{
			flag=1;
		}
		else
		{
			flag=0;
			break;
		}
	}
	for(i=0;i<m;i++)
	{
		for(j=0;j<m;j++)
		{
			sum2=sum2+a[i][j];
		}
		if(sum==sum1)
		{
			flag=1;
		}
		else
		{
			flag=0;
			break;
		}
	}
	if(flag==1)
	{
		System.out.println("yes");
	}
	else
	{
		System.out.println("no");
	}
	
	}
	
}


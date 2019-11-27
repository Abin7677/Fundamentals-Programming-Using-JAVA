import java.util.Scanner;

public class uppertri {
	public static void main(String arg[]) {
		
	Scanner s=new Scanner(System.in);
	int m=s.nextInt();
	int a[][]=new int[m][m];
	int i,j,f=0;
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
				if(i>j && a[i][j]==0)
				{
					f=1;
				}
			}
		}
	if(f==1)
		System.out.println("yes");
	else
		System.out.println("no");
}
}

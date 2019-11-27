import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class string {
	public static void main(String arg[]) throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the strings");
		System.out.println();
		int size=Integer.parseInt(br.readLine());
		String a[]=new String[size];
		for(int i = 0;i<size;i++)
		{
			a[i]=br.readLine();
		}
		char c;
		for(int i = 0;i<size;i++)
		{
			c=a[i].charAt(0);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
			{
				System.out.println(a[i]);
			}
			}
		}
}


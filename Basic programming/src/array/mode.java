package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class mode {
public static void main(String arg[]) throws NumberFormatException, IOException
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int n=Integer.parseInt(br.readLine());
	int a[]=new int[n];
	int b[]=new int[n];
	int i,j;
	int max_count=0,count=0,value=0,flag=0;
	//int res=a[0];
	for(i=0;i<n;i++)
	{
		a[i]=Integer.parseInt(br.readLine());
	}
	Arrays.sort(a);
    for(i=0;i<n;i++)
    {
    	for(j=0;j<n;j++)
    	{
    	if(b[j]==a[i])
    	{
    		++count;
    	}
    	}
    if(count>max_count)
    {
    	max_count=count;
    	flag=1;
    }
    else
    {
    	flag=0;
    }}
    	if(flag==1) {
    System.out.println("The mode of the array is"+value);}
    else
        System.out.println("The mode of the array is none");
    }
}




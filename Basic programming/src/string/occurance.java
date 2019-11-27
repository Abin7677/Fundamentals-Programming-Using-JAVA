package string;

import java.util.Scanner;

public class occurance {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
      String st=s.next();
      String str=st.replaceFirst("the","");
      System.out.println(str);
	}
}

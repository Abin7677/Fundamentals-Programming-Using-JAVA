package pattern;

import java.util.Scanner;

public class p1 {
	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String st=s.next();
        int len=st.length();
 
        for (int i = 0; i < len; i++) {
            if (i == 0 || i == len-1) {
                for (int j = 0; j < len; j++) {
                    System.out.print(st.charAt(i));
                }
                System.out.println();
            }
            if (i >= 1 && i <= len-2) {
                for (int j = 0; j < len; j++) {
                    if (j == 0 || j == len-1) {
                        System.out.print(st.charAt(j));
                    } else if (j >= 1 && j <= len-2) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}



package company;

import java.util.Scanner;

public class sum_prime {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int lower=s.nextInt();
        int high=s.nextInt();
        int sum=0;
        while (lower <= high) {
            int count=0;
            for(int i = 2; i <= lower/2; i++) {
                if(lower % i == 0) {
                    count++;
                    break;
                }
            }
            if (count==0)
            	sum=sum+lower;
               // System.out.print(lower + " ");
            ++lower;
        }
        System.out.println(sum);
	}

}

package array;

import java.util.Scanner;

public class increment {
	public static void main(String []args){

	    int min, max, increment;

	    Scanner in = new Scanner(System.in);

	    System.out.println("Enter min value: ");
	    in.nextInt();
	    System.out.println("Enter max value: ");
	    in.nextInt();
	    System.out.println("Enter increment value: ");
	    in.nextInt();

	    int i;
	    for(i=1; i<=10; i+=2){
	    System.out.println(i);
	    }
}}

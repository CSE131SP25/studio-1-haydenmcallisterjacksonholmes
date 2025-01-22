package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("What is the first integer you want to average with?");
		int n1 = in.nextInt();
		System.out.println("And the second one?");
		int n2 = in.nextInt();
		double n3 = (n1+n2)/2.0;
		System.out.println("The average of these two integers is " + n3 + ".");
		
	}

}

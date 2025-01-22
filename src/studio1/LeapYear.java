package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("What year would you like to check?");
		int n1 = in.nextInt();
		if(n1%4 == 0 && n1%100 !=0 || n1%400 == 0){
			System.out.println("This year is a leap year.");
		}
		else {
			System.out.println("This year is not a leap year :(");
	}
	}
}

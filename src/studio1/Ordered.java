package studio1;

import java.util.Scanner;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Value for x?");
		int x = in.nextInt();
		System.out.println("Value for y?");
		int y = in.nextInt();
		System.out.println("Value for z?");
		int z = in.nextInt();
		// 
		if(x>y && y>z||x<y && y<z){
			System.out.println("This sequence is good");
		}
		else {
			System.out.println("This sequence is horrible. boo.");
		}
		
	}

}

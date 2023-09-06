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
		
		boolean isOrdered=true;
		
		//Ascending
		boolean a=(y>x);
		boolean b=(z>y);
	
		
		//Descending
		boolean c=(y<x);
		boolean d=(z<y);
		
		isOrdered=a&&b||c&&d;
		System.out.println(isOrdered);
		
		
		

	}

}

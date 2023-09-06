package studio1;

import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Year: ");
		int year = in.nextInt();
		
		int condition1= year%4;
		int condition2= year%100;
		int condition3= year%400;
		
		boolean output = (condition1==0 && condition2!=0)||(condition3==0);
		System.out.println("Leap Year: "+output);
	
	}

}

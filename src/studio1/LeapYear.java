package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("What is the year?");
		int year1 = in.nextInt();
boolean Leapyear = (year1 % 4 == 0) && (year1 % 100 != 0) || (year1 % 400 == 0);
System.out.println(Leapyear);
		
	}

}

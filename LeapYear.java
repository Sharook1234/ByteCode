6.Write a program to check whether a year is leap year or not?

import java.util.*;
class LeapYear{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Year");
		int num = sc.nextInt();
		if((num%4==0 && num%100!=0)||num%400==0)
			System.out.println("Leap Year");
		else
			System.out.println("Not Leap Year");
	}
}
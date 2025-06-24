11) Write a Java program to check if a given year is a leap year using the ternary operator?

import java.util.*;
class Eleven{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the year: ");
		int year=sc.nextInt();
		String result=(year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)?"Leap Year":"Not Leap Year";
		System.out.println(result);
	}
}


	
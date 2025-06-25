11.Write a program to input week number and print week day?

import java.util.*;
class Week{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a week day");
		int week = sc.nextInt();
		switch(week){
			case 0: System.out.println("Monday");
				break;
			case 1: System.out.println("Tuesday");
				break;
			case 2: System.out.println("Wednesday");
				break;
			case 3: System.out.println("Thursday");
				break;
			case 4: System.out.println("Friday");
				break;
			case 5: System.out.println("Saturday");
				break;
			case 6: System.out.println("Sunday");
		}
			
	}
}
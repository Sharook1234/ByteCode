5.Write a program to check whether a number is even or odd?

import java.util.*;
class EvenOdd{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt();
		if(num%2==0)
			System.out.println("Even Number");
		else
			System.out.println("Odd Number");
	}
}
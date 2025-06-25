10.Write a program to check whether a character is uppercase or lowercase alphabet?

import java.util.*;
class UpperLower{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character");
		char ch = sc.next().charAt(0);
		if(ch >= 'A' && ch <= 'Z')
			System.out.println("Uppercase");
		else
			System.out.println("Lower");
	}
}
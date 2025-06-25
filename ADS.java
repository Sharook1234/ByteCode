9.Write a program to input any character and check whether it is alphabet, digit or special character?

import java.util.*;
class ADS{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character");
		char ch = sc.next().charAt(0);
		if(ch >= 'a' && ch <= 'z')
			System.out.println("Alphabet");
		else if(ch >= '0' && ch <= '9')
			System.out.println("Digit");
		else
			System.out.println("Special Character");
	}
}
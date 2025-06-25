7.Write a program to check whether a character is alphabet or not?

import java.util.*;
class AlphabetOrNot{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character");
		char ch = sc.next().charAt(0);
		if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
			System.out.println("Alphabet");
		else
			System.out.println("NOt Alphabet");
	}
}
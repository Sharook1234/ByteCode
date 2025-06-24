10) Write a Java program to compare two characters and print the results? 

import java.util.*;
class Ten{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char a=sc.next().charAt(0);
		System.out.println("Enter a character: ");
		char b=sc.next().charAt(0);
		if(a==b)
			System.out.println("both characters are equal");
		else
			System.out.println("both characters are not equal");
	}
}

Output:
Enter a character:
s
Enter a character:
a
both characters are not equal
		
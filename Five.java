5) Write a Java program that takes five numbers as input to calculate and print the average of the numbers

import java.util.*;
class Five{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values");
		int a=sc.nextInt();	
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		int avg=(a+b+c+d+e)/5;
		System.out.print("Average: "+avg);
	}
}

Output:
Enter values
10
20
30
40
50
Average: 30
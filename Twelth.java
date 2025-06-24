12) Write a Java program to determine the sign of a given number (positive, negative, or zero) using the ternary operator?

import java.util.*;
class Twelth{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Number: ");
		int num=sc.nextInt();
		String str=(num>0)?"Positive":(num==0)?"Zero":"Negative";
		System.out.println(str);
	}
}

Output:
Enter an Number:
-5
Negative

C:\byte code\Operator Assignment>java Twelth
Enter an Number:
0
Zero

C:\byte code\Operator Assignment>java Twelth
Enter an Number:
2
Positive
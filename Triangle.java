//14.Write a program to input angles of a triangle and check whether triangle is valid or not?

import java.util.*;
class Triangle{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter angles in triangle");
		float a=sc.nextFloat();
		float b=sc.nextFloat();
		float c=sc.nextFloat();
		float sum=a+b+c;
		if(sum==180)
			System.out.println("triangle");
		else
			System.out.println("triangle");
	}
}

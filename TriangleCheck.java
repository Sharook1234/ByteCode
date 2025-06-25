//15.Write a program to check whether the triangle is equilateral, isosceles or scalene triangle?
import java.util.*;
class TriangleCheck{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter angles in triangle");
		float a=sc.nextFloat();
		float b=sc.nextFloat();
		float c=sc.nextFloat();
		if((a+b+c)==180)
		{
			if(a==b && b==c && c==a)
				System.out.println("Equilateral");
			else if(a==b || b==c || c==a)
				System.out.println("isosceles");
			else
				System.out.println("Scalene");
		}
		else
			System.out.println("Inavaild Triangle");
	}
}
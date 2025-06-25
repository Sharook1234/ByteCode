//2.Write a program to find maximum between three numbers?
import java.util.*;
class MaxOfThree{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 Numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		if(num1>num2){
			if(num1>num3)
				System.out.println("Greater Number is "+num1);
			else
				System.out.println("Greater Number is "+num3);
		}
		else{
			if(num2>num3)
				System.out.println("Greater Number is "+num2);
			else
				System.out.println("Greater Number is "+num3);
		}
	}
}
		
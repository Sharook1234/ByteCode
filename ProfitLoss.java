//16.Write a program to calculate profit or loss?

import java.util.*;
class ProfitLoss{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter cost price:");
		double a=sc.nextDouble();
		System.out.println("enter selling price:");
		double b=sc.nextDouble();
		double cal=b-a;
		if(cal>0)
			System.out.println("Profit");
		else if(cal<0)
			System.out.println("Loss");
		else
			System.out.println("no Profit or Loss");
	}
}
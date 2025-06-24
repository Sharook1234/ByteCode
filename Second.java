2) Greatest of four numbers using nested ternary operator

import java.util.*;
class Second{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the 4 values one by one");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int x=(a>b)?(a>c)?(a>d?a:d):(c>d?c:d):(b>c)?(b>d?b:d):(c>d?c:d);
		System.out.println("Greatest value: "+x);
	}
}
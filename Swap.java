13) Write a Java function to swap two variables without using a third variable?

class Swap{
	public static void main(String args[]){
		int a=10,b=20;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a= "+a+ "b= "+b);
	}
}
 
Output:
a= 20b= 10
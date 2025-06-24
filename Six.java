6) Assign values of variables 'a' and 'b' as 55 and 70 respectively and then check if both the conditions 'a < 50' and 'a < b' are true

class Six{
	public static void main(String args[]){
		int a=55,b=70;
		String x=a<50?"True":"False";
		System.out.println(x);
		String y=a<b?"True":"False";
		System.out.println(y);
	}
}

Output:
False
True
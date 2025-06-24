3) Consider the following code snippet:
   int i = 10;
   int n = i++%5;
  i) What are the values of i and n after the code is executed?
  ii)What are the final values of i and n if instead of using the postfix increment operator (i++), you use the prefix version (++i))?

class Third{	
	public static void main(String args[]){
		int i = 10;
   		int n =i++%5;
		System.out.println("i value: "+i);
		System.out.println("n value: "+n);
	}
}
output 1:
	i value: 11
	n value: 0
output 2:
	i value: 11
	n value: 1

import java.util.*;
class PerGrade{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total marks");
		float tot=sc.nextFloat();
		System.out.println("Enter obtained marks");
		int obt=sc.nextInt();
		float per=(obt/tot)*100;
		System.out.println(per+"%");
	}
}
		
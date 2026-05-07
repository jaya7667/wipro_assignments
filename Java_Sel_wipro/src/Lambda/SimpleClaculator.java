package Lambda;
import java.util.Scanner;
interface Calculator{
	int op(int a, int b);
}

public class SimpleClaculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator add=(a,b)->a+b;
		Calculator sub=(a,b)->a-b;
		Calculator mul=(a,b)->a*b;
		Calculator div=(a,b)->a/b;
		System.out.println("Enter the two numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Addition="+ add.op(a, b));
		System.out.println("Subtraction="+ sub.op(a, b));
		System.out.println("Multiplication="+ mul.op(a, b));
		System.out.println("Division="+ div.op(a, b));
		
		// TODO Auto-generated method stub

	}

}

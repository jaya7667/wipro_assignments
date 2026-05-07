package Task1;
import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range=");
		int a= sc.nextInt();
		int i=a;
		do {
			System.out.println("a="+i);
			i--;
		}while(i>a);
	}

}

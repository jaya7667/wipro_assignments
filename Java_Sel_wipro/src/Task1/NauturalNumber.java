package Task1;
import java.util.Scanner;

public class NauturalNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter range of number");
		int a = sc.nextInt();
		int i=1,sum=0;
		while(i<=a) {
			sum=sum+i;
		}
		System.out.println("Sum of natural numbers="+sum);
		
		// TODO Auto-generated method stub

	}

}

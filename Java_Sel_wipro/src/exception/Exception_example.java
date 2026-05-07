package exception;
import java.util.Scanner;

public class Exception_example {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		int b=88;
		try 
		{
			int c=b/a;
			System.out.println("Division="+c);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("end");
		// TODO Auto-generated method stub

	}

}

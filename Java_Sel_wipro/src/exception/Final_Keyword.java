package exception;

import java.util.Scanner;

public class Final_Keyword {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter divident");
		int a=sc.nextInt();
		System.out.println("Enter divisor");
		int b=sc.nextInt();
		
		try
		{
			int c=a/b;//10/0
			System.out.println("Division is="+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("pass the level");
		}
     System.out.println("End");
		// TODO Auto-generated method stub

	}

}

package exception;

import java.util.Scanner;

public class MultipleExceptions {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number");
		int a =sc.nextInt();
		int b= 88;
		try {
			int c= b/a;
			System.out.println("Division="+c);
			String str=null;
			System.out.println(str.charAt(1));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("End");
		// TODO Auto-generated method stub

	}

}

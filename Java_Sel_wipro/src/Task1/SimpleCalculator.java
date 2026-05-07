package Task1;

public class SimpleCalculator {
	public static void main(String[] args) {
		int ch='+';
		int a=2,b=5;
		System.out.println("Please enter '+,-,*,/'");
		switch(ch) 
		{
		case '+':
			System.out.println(a+b);
			break;
		case '-':
			System.out.println(a-b);
			break;
		case '*':
			System.out.println(a*b);
			break;
		case '/':
			System.out.println(a/b);
			break;
		default: System.out.println("Invalid input");	
		
		}
	}

}

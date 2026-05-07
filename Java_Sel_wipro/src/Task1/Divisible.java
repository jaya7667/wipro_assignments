package Task1;

public class Divisible {
	public static void main(String[] args) {
		int num=55;
		if(num%5==0 && num%11==0) {
			System.out.println("Divible by 5 and 11");
		}
		else if(num%5==0) {
			System.out.println("Divisible by 5");
		}
		else if(num%11==0) {
			System.out.println("Divisibe by 11");
		}
		else {
			System.out.println("Not divisible");
		}
	}

}

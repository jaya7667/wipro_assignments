package Task1;

public class Percentage {

	public static void main(String[] args) {
		float per= 97.8f;
		if(per<0|| per>100) {
			System.out.println("Invalid input");
		}
		else if(per>=75) {
			System.out.println("Dist");
			if(per>=85) {
				System.out.println("A+");
			}
			if(per>=95) {
				System.out.println("A++");
			}
		}
		else if(per>=60 && per<75) {
			System.out.println("First Class");
		}
		else if(per>=50 && per<60) {
			System.out.println("Second class");
		}
		else if(per>=40 && per<50) {
			System.out.println("Pass class");
		}
		else {
			System.out.println("Fail");
		}
		// TODO Auto-generated method stub

	}

}

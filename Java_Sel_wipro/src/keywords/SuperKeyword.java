package keywords;
class Parent{
	int x=100;
	void pa() {
		System.out.println("Parent class method access using super keyword");
	}
}
class Child extends Parent{
	int x=10;
	Child(){
		super();
	}
	void show() {
		super.pa();
		System.out.println("Child class value of x="+x);
		System.out.println("Parent class value of x="+super.x);
	}
}

public class SuperKeyword {

	public static void main(String[] args) {
		Child c= new Child();
		c.show();
		// TODO Auto-generated method stub

	}

}

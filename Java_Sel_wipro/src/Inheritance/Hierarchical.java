package Inheritance;
class Grandparent1{
	void openland()
	{
		System.out.println("Openland for commercial use");
	}
}
class Parent1 extends Grandparent1{
	void flat()
	{
		System.out.println("2BHK Flat");
	}
	void car()
	{
		System.out.println("Bolero");
	}
}
class Parent2 extends Grandparent1{
	void flat()
	{
		System.out.println("2BHK Flat");
	}
	void bike() {
		System.out.println("Pulsar");
	}
}
class Child1p1 extends Parent1{
	void bike() {
		System.out.println("Pulsar");
	}
}


public class Hierarchical {

	public static void main(String[] args) {
		Child1p1 mohan= new Child1p1();
		mohan.flat();
		mohan.car();
		mohan.bike();
		
		// TODO Auto-generated method stub

	}

}

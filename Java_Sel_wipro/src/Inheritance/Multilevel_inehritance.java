package Inheritance;
class Grandparent{
	void openland()
	{
		System.out.println("Openland for commercial use");
	}
}
class Parent extends Grandparent{
	void flat()
	{
		System.out.println("2BHK Flat");
	}
}
class Child extends Parent{
	void bike() {
		System.out.println("Pulsar");
	}
}

public class Multilevel_inehritance {

	public static void main(String[] args) {
		Child mohan = new Child();
		mohan.flat();
		mohan.bike();
		mohan.openland();
		Parent soham = new Parent();
		soham.flat();
		// TODO Auto-generated method stub

	}

}

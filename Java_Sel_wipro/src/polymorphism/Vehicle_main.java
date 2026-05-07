package polymorphism;
class Vehicle{
	void nooftyres()
	{
		System.out.println("any");
	}
	void type()
	{
		System.out.println("Any");
	}
}
class Scooter extends Vehicle{
	void nooftyres()
	{
		System.out.println("2");
	}
	void type()
	{
		System.out.println("Petrol");
	}
}
class Car extends Vehicle
{
	void nooftyres()
	{
		System.out.println("4");
	}
	void type()
	{
		System.out.println("Diesel");
	}
}

public class Vehicle_main {

	public static void main(String[] args) {
		Scooter sc=new Scooter();
		sc.nooftyres();
		sc.type();
		System.out.println("***********************");
		
		// TODO Auto-generated method stub

	}

}

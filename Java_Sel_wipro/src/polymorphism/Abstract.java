package polymorphism;
		//Polymorphism- 1. compile time polymorphism -Method overloading-
//		                 1.same method name but different arguments
//		                 2. method overloading done in same class
//		              2. Runtime polymorphism- Method overriding
//		                 same method name and same arguments
//		                 2. method overriding done in different class (Is - a- relationship(inheritance))
		 
		abstract class Vehicle1
		{
			abstract void nooftyres();
			
			void type()
			{
				System.out.println("Petrol/Diesel/electric");
			}
		}
		class Scooter1 extends Vehicle1
		{
			void nooftyres()
			{
				System.out.println("no of tyre for scooter=2");
			}
			
		}
		class Car1 extends Vehicle1
		{
			void nooftyres()
			{
				System.out.println("no of tyre for car=4");
			}
			
		}
		public class Abstract {
		 
			public static void main(String[] args) {
				Scooter1 sc=new Scooter1();
				sc.nooftyres();
				sc.type();
				System.out.println("*********************");
				Car1 c=new Car1();
				c.nooftyres();
				c.type();
				//Vehicle v=new Vehicle();
				
		 
			}
		 
		}


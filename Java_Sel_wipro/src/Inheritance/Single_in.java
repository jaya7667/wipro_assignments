package Inheritance;
import Encapsulation.Student;
class Animal {
	void eat(String eat) {
		System.out.println("Eat="+eat);
	}
	void sound(String sd) {
		System.out.println("Sound="+sd);
	}
}
class Dog extends Animal{
		void color() {
			System.out.println("Black");
		}
	}
class Cat extends Animal{
		void walk() {
			System.out.println("Cat Walk");
		}
	}


public class Single_in {
	public static void main(String[] args) {
		Dog d= new Dog();
		d.color();
		d.eat("Royal canin");
		Cat c= new Cat();
		c.walk();
		c.eat("Fish");
		c.sound("meow");
		
		// TODO Auto-generated method stub

	}

}

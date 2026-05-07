package Class_Object_Method;

public class Animal {

	void sound(String animalname, String sound)
	{
		System.out.println("Animal name"+animalname);
		System.out.println("Animal sound"+sound);
	}
	void show() //no argument method
	{
		System.out.println("Nothing to say");
		
	}
	public static void main(String[] args) {
		Animal dog=new Animal();
		dog.sound("Max", "Barking");
		System.out.println("*****************************");
		Animal cat=new Animal();
		cat.sound("Kitty","Meoww");
	}
	
	// TODO Auto-generated method stub

}



package polymorphism;
interface Hospital{
	void infra();
	void degree();
	static void doc()
	{
		System.out.println("Hello");
	}
}
class Doctor implements Hospital
{
	public void infra()
	{
		System.out.println("Ots, wards, doctor");
	}
	public void degree()
	{
		System.out.println("MD Endo");
	}
}
class Nurse implements Hospital
{
	public void infra()
	{
		System.out.println("Ots, wards, nurse cabin, general area");
	}
	public void degree()
	{
		System.out.println("Nurse");
	}
}

public class Interface_practice {

	public static void main(String[] args) {
		Doctor d= new Doctor();
		d.infra();
		d.degree();
		System.out.println("*********************");
		Nurse n= new Nurse();
		n.degree();
				
		// TODO Auto-generated method stub

	}

}

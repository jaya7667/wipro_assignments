package Inheritance;

class Hospital {
	void hname(String hname) {
		System.out.println("Name of Hospital:"+hname);
	}
	void htype() {
		System.out.println("Government Hospital");
	}
}
class Doctor extends Hospital{
	void dname(String dname) {
		System.out.println("Name of the doctor"+dname);
	}
	void dtype() {
		System.out.println("Orthopedist");
	}
}
public class Hospital_main {

	public static void main(String[] args) {
		Doctor d= new Doctor();
		d.hname("MGM Hospital");
		d.dname("R.Sharan");
		d.htype();
		// TODO Auto-generated method stub

	}

}

package Class_Object_Method;

public class Hospital {
	void patient(String name, int wardno) {
		System.out.println("Name of patient="+name);
		System.out.println("Ward number="+wardno);
	}
	void patient(int id, String name, int wardno) {
		System.out.println("Patient id="+id);
		System.out.println("Name of patient="+name);
		System.out.println("Ward number"+wardno);
	}

	public static void main(String[] args) {
		Hospital hsp=new Hospital();
		hsp.patient(101,"Jaya",21);
		// TODO Auto-generated method stub

	}

}
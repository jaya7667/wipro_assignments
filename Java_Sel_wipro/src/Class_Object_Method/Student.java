package Class_Object_Method;

public class Student {
	
	void details(int rollno, String name) {
		System.out.println("Roll no="+rollno);
		System.out.println("Student Name="+name);
	}
	void details(int rollno, String name, int age) {
		System.out.println("Roll no="+rollno);
		System.out.println("Student Name="+name);
		System.out.println("Student Age"+age);
	}
	
	

	public static void main(String[] args) {
		Student st= new Student();
		st.details(101,"Jaya Singh");
		
		// TODO Auto-generated method stub

	}

}

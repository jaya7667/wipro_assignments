package Task1;

public class College {
	static String collegename;
	int roll;
	String name;
	void dept(String deptname){
		System.out.println("Department="+deptname);
		System.out.println("Name of student="+name);
		System.out.println("College="+collegename);
		System.out.println("Roll no="+roll);
	}
	void semester(int cgpa) {
		System.out.println("Name of student="+name);
		System.out.println("Name of student="+name);
		System.out.println("Current CGPA="+cgpa);
		
	}
	
	public static void main(String[] args) {
		College clg = new College();
		clg.dept("CSE");
	}

}

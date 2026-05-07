package staticdynamic;

public class Emp {
	static class InnerClass{
		//by default static
		//we cannot call non static method
		void test() {
		System.out.println("Inner Class");
	}
	}

		int empid;
		String name;
		static String companyname="Wipro";
		void show(int empid1, String name1) 
		{
			empid=empid1;
			name=name1;
			
			System.out.println("empid="+empid);
			System.out.println("name="+name);
			System.out.println("companyname="+companyname);
		}
		static void details(int empid1, String name1) {
			System.out.println("companyname="+companyname);
		}
		static {
			System.out.println("block");
		}
		{
			System.out.println("second block");
		}
		public static void main(String args[]) {
			Emp  emp= new Emp();
			emp.show(101,"Rohit");
			emp.show(102,"Soham");
			details(101,"Rohit");
			Emp.InnerClass t =new InnerClass();
			t.test();
		}
		
		// TODO Auto-generated method stub

	}

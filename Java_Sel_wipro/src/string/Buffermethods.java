package string;

public class Buffermethods {
	public static void main(String[] args) {
		StringBuffer sb= new StringBuffer("Hello");
		System.out.println(sb);
		System.out.println(sb.capacity());//return default length
		System.out.println(sb.length());
		System.out.println(sb.substring(3));
		System.out.println(sb.insert(5, "Nisha"));
		
		//length=index+1
		//index=length-1
	}

}

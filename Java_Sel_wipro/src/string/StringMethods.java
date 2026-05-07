package string;

public class StringMethods {

	public static void main(String[] args) {
		String str="Hello";
		String str1="Welcome";
		System.out.println(str);
		System.out.println(str.charAt(1)); //e
		System.out.println(str.indexOf('H')); //0
		System.out.println(str.codePointAt(2)); //
		System.out.println(str.codePointBefore(1));
		System.out.println(str.compareTo(str));
		System.out.println(str.compareToIgnoreCase(str1));
		System.out.println(str.concat("Nisha"));//HelloNisha
		str=str.concat("Nisha");
		System.out.println(str);//Hello
		System.out.println(str1.contains("come"));
		System.out.println(str.equals(str1));
		System.out.println(str);
		// TODO Auto-generated method stub

	}

}

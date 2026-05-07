package Collections;

import java.util.*;

public class Tree_set {

	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>();
		set.add("Mango");
		set.add("Orange");
		set.add("Orange");
		set.add("Kiwi");
		System.out.println(set);
		System.out.println(set.equals("Orange"));
		set.remove("Orange");
		System.out.println(set);
		// TODO Auto-generated method stub

	}

}

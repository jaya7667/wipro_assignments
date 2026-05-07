package Collections;

import java.util.*;

public class Linked_Hashset {

	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<String>();
		set.add("Mango");
		set.add("Orange");
		set.add("Orange");
		set.add("Kiwi");
		set.add(null);
		set.add(null);
		System.out.println(set);
		System.out.println(set.equals("Orange"));
		set.remove("Orange");
		System.out.println(set);
		
		// TODO Auto-generated method stub

	}

}

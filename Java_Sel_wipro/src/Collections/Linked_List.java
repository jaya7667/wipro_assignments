package Collections;

import java.util.LinkedList;
import java.util.List;

public class Linked_List {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		LinkedList<String> l = new LinkedList<String>();
		
		list.add("Mango");
		list.add("Mango");
		list.add("Banana");
		list.add("Orange");
		list.add(null);
		System.out.println(list);
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.remove(1)); //Returns the element
		list.remove(0);
		System.out.println(list);
		System.out.println(list.isEmpty());
		System.out.println(list.indexOf("Banana"));
		// TODO Auto-generated method stub

	}

}

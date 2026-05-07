package Collections;
import java.util.*;

public class Collection_list {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list1 =new ArrayList<Integer>();
		list1.add(5);
		list1.add(4);
		list.add(9);
		list.add(0);
		list.add(8);
		list.add(null);
		list.add(null);
		list.add(null);
		System.out.println(list);
		System.out.println(list.indexOf(8));
		System.out.println(list.contains(9));
		System.out.println(list.isEmpty());
		System.out.println(list.lastIndexOf(null));
		list.remove(1); //remove index element
		list.remove((Integer)9); 
		System.out.println(list);
		// TODO Auto-generated method stub

	}

}

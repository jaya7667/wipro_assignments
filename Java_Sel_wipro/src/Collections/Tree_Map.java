package Collections;
import java.util.*;

public class Tree_Map {

	public static void main(String[] args)
	{
		Map<String, Integer> map = new TreeMap<String, Integer>();
		map.put("One",1);
		map.put("Two",2);
		map.put("Three",3);
		map.put("Four",4);
		map.put("Five",5);
		map.put("Three",8);
		System.out.println(map);
		System.out.println(map.containsKey("Two"));
		System.out.println(map.containsValue(7));
		System.out.println(map);
		map.replace("Two", 2, 5);
		map.replace("Five", 7);
		System.out.println(map);
		System.out.println(map.get("One"));// TODO Auto-generated method stub

	}

}

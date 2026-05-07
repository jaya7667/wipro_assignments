package Collections;

import java.util.*;

public class Priority_Queue {

	public static void main(String[] args) {
		Queue<String> q = new PriorityQueue<String>();
		q.add("Delhi");
		q.add("Ahemadabad");
		q.add("Agra");
		q.add("Odisha");
		System.out.println(q);
		q.remove("Agra");
		System.out.println(q);
		System.out.println(q.offer("Dehradun"));
		System.out.println(q);
		System.out.println(q.peek()); //retrieve
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);//retrieve and remove
		// TODO Auto-generated method stub

	}

}

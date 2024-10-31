package collection.com;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
LinkedList<Integer> ll = new LinkedList();
ll.add(10);
ll.add(20);
ll.add(30);
ll.add(40);
System.out.println(ll);
System.out.println(ll.getLast());
System.out.println(ll.contains(30));
System.out.println(ll.getFirst()); 
System.out.println(ll.removeLastOccurrence(20));
System.out.println(ll.get(0));
ll.add(1, 15);
System.out.println(ll);
	}
}

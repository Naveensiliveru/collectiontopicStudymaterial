package set.com;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {

	public static void main(String[] args) {
	HashSet<String> hs = new HashSet();
	hs.add("four");
	hs. add("one");
	hs.add("Three");
	hs.add("two");
	hs.add("one");
	hs.add("null");
	System.out.println(hs);
	hs.remove("Three");
	System.out.println(hs);
	Iterator <String > it = hs.iterator();
	while(it.hasNext() ) {
		System.out.println(it.next());
	}
	

	}

}

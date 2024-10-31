package set.com;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> hs  = new HashSet();
		hs.add("one");
		hs.add("two");
		hs.add("three");
		hs.add("four");
		hs.add("one ");
		hs.add("null");
		System.out.println(hs);
		hs.remove("three");
		
		Iterator<String> it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		
	}

}

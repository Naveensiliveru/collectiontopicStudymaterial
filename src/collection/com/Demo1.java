package collection.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Demo1 {

	public static void main(String[] args) {
		ArrayList <Integer> a1= new ArrayList<>();
		a1.add(8);
		a1.add(10);
		a1.add(8);
		a1.add(11);
		a1.add(6);
		System.out.println("========for loop Approch");
		for(int i=0;i<a1.size();i++) {
			System.out.println(a1.get(i));
			Collections.sort(a1);
		}
		for( Object obj :a1) {
			System.out.println(obj);
		}
		Iterator it = a1.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		

	}

}

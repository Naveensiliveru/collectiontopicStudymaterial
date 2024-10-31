package collection.com;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		List l = new ArrayList();
		l.add(100);
		l.add(200);
		l.add(300);
		l.add(400);
		l.add(500);
		l.add(600);
	
		System.out.println(l);
l.add(0,500);
System.out.println(l);
l.add(5,300);
System.out.println(l);
l.set(0, 50);
System.out.println(l);
System.out.println(l.contains(700));
System.out.println(l.get(1));
List l2 = new ArrayList();
l2.add(100);
l2.add(800);
l2.add(900);
l2.add(700);
l2.retainAll(l);

System.out.println(l);
System.out.println(l2);



		}

}

package set.com;

import java.util.HashSet;
import java.util.Iterator;


class Student{

private int id;
private String name;

public Student(int i, String string) {
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + "]";
}

}

public class Demo2 {

	public static void main(String[] args) {
		HashSet <Student> hs = new HashSet();
		hs.add(new Student(101, "Naveen"));
		hs.add(new Student(102, "madhu"));
		hs.add(new Student(103, "Swathi"));
		
 Iterator <Student> it = hs.iterator();
 while (it.hasNext()) {
	 System.out.println(it.next());
 }
	}

}

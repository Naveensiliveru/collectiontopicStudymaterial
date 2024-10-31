package set.com;

import java.util.HashSet;
import java.util.Iterator;

import collection.com.Student;

public class Demo {

	public static void main(String[] args) {
		HashSet<Student> hs = new HashSet();
		hs.add(new  Student(101, "Raju"));
		hs.add(new Student(102, "Madhu"));
		hs.add(new Student(103, "Rani"));
		hs.add(new Student(104, "jhon"));
		 Iterator<Student> it = hs.iterator();
		 while (it.hasNext()) {
			 System.out.println(it.next()); 
		 }

	}

}

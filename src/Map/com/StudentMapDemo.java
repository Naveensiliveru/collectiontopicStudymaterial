package Map.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StudentMapDemo {

	public static void main(String[] args) {
		Student s1 = new Student(101, "Madhu");
    Student s2 = new Student(102, "Smith");
Student s3 = new Student(103, "Naveen");
Student s4 = new Student (104, "Mohan");
Map<Integer, Student> map = new HashMap<Integer, Student>();
map.put(1, s1);
map.put(2, s2);
map.put(3,s3);
map.put(4, s4);
Set<Entry<Integer,Student>>es=map.entrySet();
for(Entry<Integer,Student>entry:es) {
	System.out.println(entry.getKey());
	System.out.println(entry.getValue());
}

	}

}

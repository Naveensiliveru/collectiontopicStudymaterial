package collection.com;

import java.util.ArrayList;

class Student{
	
	int id;
	String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}





public class test {

	public static void main(String[] args) {
		ArrayList <Student > a1= new ArrayList();
		a1.add(new Student(1, "Raju" ));
		a1.add(new Student (2, "Madhu"));
		a1.add(new Student (3, "Naveen"));
a1.add(new Student (4, "Swathi"));
a1.add(new Student (5,"pavan "));
a1.add(new Student  (6, "karthik"));
for(int i=1; i<=a1.size(); i++) {

}
System.out.println(a1);

	}}

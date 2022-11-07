package test;
import java.util.*;
public class Reverse {

	public static void main(String[] args) {
		TreeSet<Object> Employee=new TreeSet<Object>();
		
		Employee.add("Deepika");
		Employee.add("Rahul");
		Employee.add("Yash");
		Employee.add("karan");
		System.out.println("Tree set Before:" + Employee);
		Iterator<Object> emp=Employee.descendingIterator();
		System.out.println("Element in reverse order:");
		while (emp.hasNext()) {
			System.out.println(emp.next());
		}
		

	}

}

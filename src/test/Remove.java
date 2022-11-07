package test;
import java.util.List;
import java.util.ArrayList;

public class Remove {

	public static void main(String[] args) {
		List<Integer> r1= new ArrayList<>();
		r1.add(5);
		r1.add(10);
		r1.add(15);
		r1.add(20);
		r1.add(25);
		System.out.println("Original set: " +r1);
		
		int index=0;
		r1.remove(index);
		System.out.println("After removing element: " +r1);

	}

}

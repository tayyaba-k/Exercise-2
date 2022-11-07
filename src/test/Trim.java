package test;
import java.util.ArrayList;

public class Trim {

	public static void main(String[] args) {
		ArrayList<String> languages= new ArrayList<>();
		languages.add("C");
		languages.add("C++");
		languages.add("Python");
		languages.add("Java");
		languages.add("JavaScript");
		System.out.println("ArrayList are:" + languages);
		
		languages.trimToSize();
		System.out.println("Size of ArrayList:" +languages.size());

	}

}

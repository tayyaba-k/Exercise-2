package test;
import java.util.*;
import java.util.Map.Entry;


public class Key {

	public static void main(String[] args) {
		TreeMap <Integer, String> tm=new TreeMap<Integer, String>();
		tm.put(10,"India");
		tm.put(20,"Singapore");
		tm.put(30,"Dubai");
		tm.put(40,"Ukraine");
		tm.put(50,"America");
        System.out.println("Value before:" +tm);
        System.out.println("Value returned:" +tm.pollLastEntry());
        System.out.println("Value After:" +tm);
	}

}

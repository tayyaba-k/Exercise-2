package test;
import java.util.HashMap;

public class CustomObject {

	public static void main(String[] args) {
		HashMap<String, String> bank=new HashMap<String,String>();
		     bank.put("Gunjan","SBI");
		     bank.put("Inshi","CBI");
		     bank.put("Sarah","HDFC");
		     bank.put("Yashfeen","punjabbank");
		     bank.put("Shrinidhi","SBI");
		     System.out.println(" customer and bank name:");
		     bank.forEach((key,value)->System.out.println(key +"=" +value));

	}

}
 
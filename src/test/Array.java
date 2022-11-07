package test;
import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		int myArray[]=new int[] {10,20,30,40,50};
		System.out.println(Arrays.toString(myArray));
		System.out.println(myArray[0]);
		myArray=new int[] {60,70,80,90,100};

	   myArray[0]=75;
	   System.out.println(Arrays.toString(myArray));
	}
}


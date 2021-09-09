package genericsModule6;

import java.util.ArrayList;

public class Array2 {

	public static void main(String[] args) {

		ArrayList<String> str = new ArrayList<String>(); //Creating array list

		str.add("2"); //0
		str.add("4"); //1
		str.add("6"); //2
		str.add("8"); //3

		String num = str.get(2); //Gets the position entered

		System.out.println("In the array " +str+ " the element is " +num); //Outputs element in array from position entered
	}
}
	

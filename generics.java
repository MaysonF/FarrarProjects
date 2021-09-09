package genericsModule6;

import java.util.ArrayList;

public class Array {

		public static void main(String[] args) {

			ArrayList<String> str = new ArrayList<String>(); //creating array list

			str.add("DD"); //0
			str.add("EE"); //1
			str.add("FF"); //2
			str.add("GG"); //3

			String num = str.get(2); //Gets position entered

			System.out.println("In the array " +str+ " the largest element is " +num); //outputs element in array from position entered
		}
}

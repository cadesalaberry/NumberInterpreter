import java.util.ArrayList;

import number.SerialNumber;

/**
 * 
 * 
 * @author cadesalaberry
 * 
 */
public class NumberInterpreter {

	public static ArrayList<SerialNumber> numbers = new ArrayList<>();

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Parses the arguments, and creates the numbers accordingly.
		for (String arg : args) {

			System.out.println("Trying number:" + arg.toString());
			
			if (isValidSerial(arg)) {

				SerialNumber number = new SerialNumber(arg);
				numbers.add(number);
			} else {

				System.out.println("The number " + arg
						+ " is not well formatted.");
			}
		}

		
		for (SerialNumber number : numbers){

			System.out.println(number.guessedTypeReport());
		}
	}

	private static boolean isValidSerial(String string) {
		try {

			return true;
		} catch (NumberFormatException e) {
			
			return false;
		}

	}
}

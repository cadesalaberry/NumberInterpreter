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
		for (int i = 0; i < args.length; i++) {
			if (isValidInt(args[i])) {
				SerialNumber number = new SerialNumber(args[i]);
				numbers.add(number);
			} else {
				System.out.println("The number at position " + i
						+ "is not well formatted.");
			}
		}

	}

	private static boolean isValidInt(String string) {
		try {
			Integer.parseInt(string);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}

	}
}

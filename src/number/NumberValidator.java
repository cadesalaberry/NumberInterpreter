package number;

import java.util.ArrayList;

/**
 * Figures out what type of Number a certain Serial could represent.
 * 
 * @author cadesalaberry
 *
 */
public class NumberValidator {

	/**
	 * Returns an ArrayList of all the type the number can be.
	 * 
	 * @param number
	 * @return
	 */
	public static ArrayList<NumberType> getMatchingNumberTypesOf(
			SerialNumber number) {

		ArrayList<NumberType> toReturn = new ArrayList<>();

		for (NumberType type : NumberType.values()) {
			if (numberIsAValid(number, type)) {
				toReturn.add(type);
			}
		}

		return toReturn;
	}

	/**
	 * Checks if the input number correspond to the specified type.
	 * 
	 * @param number
	 * @param type
	 * @return
	 */
	private static boolean numberIsAValid(SerialNumber number, NumberType type) {

		switch (type) {

		case SSN:
			return ssn.Validator.isValid(number);
		default:
			return false;
		}
	}
}

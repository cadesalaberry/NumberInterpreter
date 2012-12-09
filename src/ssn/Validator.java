package ssn;

import java.util.ArrayList;

import number.SerialNumber;

public class Validator {

	/**
	 * Gets the countries the SSN could have been issued from.
	 * 
	 * @param number
	 * @return
	 */
	public static ArrayList<Country> getValidCountries(SerialNumber number) {

		ArrayList<Country> toReturn = new ArrayList<>();

		for (Country country : Country.values()) {

			if (isValidSSNFromCountry(number, country))
				toReturn.add(country);
		}
		return toReturn;
	}

	public static boolean isValid(SerialNumber number) {

		return getValidCountries(number).size() > 0;
	}

	public static boolean isValidSSNFromCountry(SerialNumber number,
			Country country) {

		String stringRep = "" + number.getSerialNumber();
		boolean valid = true;

		switch (country) {
		case FRANCE: {
			if (stringRep.length() == 15) {

				// Validates sexe digit
				valid = stringRep.substring(0, 1).matches("[1-3]|[7-8]");

				// Validates birth date digits
				valid = valid
						&& stringRep.substring(1, 3).matches("[0-9][0-9]");

				// Validates birth month digits
				valid = valid
						&& stringRep.substring(3, 5).matches("0[0-9]|1[0-2]|" + // 00-12
								"[2-3][0-9]|4[0-2]|" + // 20-42
								"[5-9][0-9]"); // 50-99

				// Validates digits 6-10
				valid = valid && stringRep.substring(5, 9).matches("[0-9]{4}");

				// numéro d’ordre de l’acte de naissance
				valid = valid && stringRep.substring(9, 12).matches("[0-9]{3}");

			} else
				valid = false;
			break;
		}
		default:
			valid = false;

		}

		return valid;
	}
}

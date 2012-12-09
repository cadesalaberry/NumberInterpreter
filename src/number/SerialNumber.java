package number;
import java.util.ArrayList;

/**
 * Represents a number, and knows what types of number its formatting could
 * correspond to.
 * 
 * @author cadesalaberry
 * 
 */
public class SerialNumber {

	private String serial = "";
	private ArrayList<NumberType> numberTypes;

	public SerialNumber(String serial) {

		this.serial = serial;
		this.numberTypes = NumberValidator.getMatchingNumberTypesOf(this);
	}

	/**
	 * Returns the integer hold by the number.
	 * 
	 * @return
	 */
	public String getSerialNumber() {
		return serial;
	}

	/**
	 * Checks if the number has the valid formatting to correspond to the
	 * NumberType specified.
	 * 
	 * @param type
	 * @return
	 */
	public boolean isAValid(NumberType type) {

		return this.numberTypes.contains(type);
	}

	public String guessedTypeReport(){
		
		String report = "";
		
		//TODO: call the method that generates the report.
		return report;
	}
	/**
	 * Checks if the two numbers are equal.
	 * 
	 * @param number
	 * @return
	 */
	public boolean equals(SerialNumber number) {

		return this.getSerialNumber() == number.getSerialNumber();
	}
}

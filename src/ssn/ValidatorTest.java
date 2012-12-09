package ssn;

import static org.junit.Assert.*;

import number.SerialNumber;

import org.junit.Test;

public class ValidatorTest {

	@Test
	public void testGetValidCountries() {
		SerialNumber number = new SerialNumber("100000000000000");
		boolean b = Validator.getValidCountries(number).contains(Country.FRANCE);
		assertTrue(b);
	}

	@Test
	public void testIsValid() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testIsValidSSNFromCountry() {
		SerialNumber number = new SerialNumber("100000000000000");
		boolean b = Validator.isValidSSNFromCountry(number,Country.FRANCE);
		assertTrue(b);
	}

}

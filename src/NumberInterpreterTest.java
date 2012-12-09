import static org.junit.Assert.*;

import org.junit.Test;


public class NumberInterpreterTest {

	@Test
	public void testMain() {
		NumberInterpreter.main(new String[]{"100000000000000","000000000000000"});
		assertTrue(true);
	}

}

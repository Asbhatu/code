import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseTest {

	@Test
	public void getReverseTest() {
		Reverse rev = new Reverse();
		String input = "Test";
		String expectedOutput = "tseT";
		byte[] result = rev.getReverse(input.getBytes());
		
		assertEquals(expectedOutput, new String(result));
		
		
		
	}

}

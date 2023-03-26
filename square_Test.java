package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class square_Test {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		int output = test.square(6);
		assertEquals(36, output);
		
	}

}

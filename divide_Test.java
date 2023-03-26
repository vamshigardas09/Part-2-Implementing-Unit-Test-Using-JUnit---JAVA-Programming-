package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class divide_Test {

	@Test
		 public void test() {
		        JunitTesting test = new JunitTesting();
		        double result = 7.0/2.0;
		        assertEquals(3.5, result, 0.0001);
		    }
		    
		    
}

package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountA_Test 
{
  @Test
  public void test() {
	  JunitTesting test = new JunitTesting();
	  int output = test.countA("alphabetaaaa");
	  assertEquals(6,output);
	  
  }
	


}

package exercise4;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanToIntTEST {

	RomanToInt romantoint;
	
	@Test
	public void test100() {
		romantoint = new RomanToInt();
		assertEquals(100, romantoint.convert("C"));
	}
	
	@Test
	public void test26() {
		romantoint = new RomanToInt();
		assertEquals(26, romantoint.convert("XXVI"));
	}
	
	@Test
	public void test121() {
		romantoint = new RomanToInt();
		assertEquals(121, romantoint.convert("CXXI"));
	}

}

package exercise1;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumToWordsTEST {
	Converter converter = new Converter();
	
	@Test
	public void testForConvert_1_to_one() {
		assertEquals("one",converter.convert(1));
	}

	@Test
	public void testForConvert_10_to_ten() {
		assertEquals("ten",converter.convert(10));
	}
	
	@Test
	public void testForConvert_11_to_Eleven() {
		assertEquals("eleven",converter.convert(11));
	}
	
	@Test
	public void testForConvert_20_to_twenty() {
		assertEquals("twenty",converter.convert(20));
	}
	
	@Test
	public void testForConvert_21_to_twentyOne() {
		assertEquals("twenty one",converter.convert(21));
	}
	
	@Test
	public void testForConvert_30_to_thirty() {
		assertEquals("thirty",converter.convert(30));
	}
	
	@Test
	public void testForConvert_99_to_ninetyNine() {
		assertEquals("ninety nine",converter.convert(99));
	}
	
	@Test
	public void testForConvert_100_to_OneHundred() {
		assertEquals("one hundred",converter.convert(100));
	}
	
	@Test
	public void testForConvert_200_to_TwoHundred() {
		assertEquals("two hundred",converter.convert(200));
	}
	
	@Test
	public void testForConvert_1053_to_OneThousandFiftyThree() {
		assertEquals("one thousand fifty three",converter.convert(1053));
	}
	
	@Test
	public void testForConvert_2523_to_TwoThousandFiveHundredTwentyThree() {
		assertEquals("two thousand five hundred twenty three",converter.convert(2523));
	}
	

	
}

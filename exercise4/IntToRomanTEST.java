package exercise4;
import static org.junit.Assert.*;
import org.junit.Test;

public class IntToRomanTEST{
	
	IntToRoman inttoroman;

@Test
public void test1() {
	inttoroman = new IntToRoman();
	assertEquals("I", inttoroman.convert(1));
}

@Test
public void test52() {
	inttoroman = new IntToRoman();
	assertEquals("LII", inttoroman.convert(52));
}
	
@Test
public void test30() {
	inttoroman = new IntToRoman();
	assertEquals("XXX", inttoroman.convert(30));
}

@Test
public void test100() {
	inttoroman = new IntToRoman();
	assertEquals("C", inttoroman.convert(100));
}


}
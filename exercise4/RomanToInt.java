package exercise4;


import java.util.HashMap;
import java.util.Map;


public class RomanToInt {

	private static final Map<Character, Integer> MAP = new HashMap<>();

	   static {
	      MAP.put('I', 1);
	      MAP.put('V', 5);
	      MAP.put('X', 10);
	      MAP.put('L', 50);
	      MAP.put('C', 100);
	      MAP.put('M', 1000);
	   }
	
	
	public int convert(String romanNumber) {
	      int intResult = 0;
	      int intResultPrevious = 0;
	      int intResultCurrent = 0;

	      for (int i = 0; i < romanNumber.length(); i++) {
	         intResultCurrent = MAP.get(romanNumber.charAt(i));
	         if (intResultCurrent > intResultPrevious) {
	            intResult = intResult + intResultCurrent - 2 * intResultPrevious;
	         } else {
	            intResult += intResultCurrent;
	         }

	         intResultPrevious = intResultCurrent;
	      }

	      return intResult;
	   }

}

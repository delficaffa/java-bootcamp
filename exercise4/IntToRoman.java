package exercise4;
import java.util.Collections;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class IntToRoman {

		private static final SortedMap<Integer, String> MAP = new TreeMap<Integer, String>(
				Collections.reverseOrder());
		static {
			MAP.put(1, "I");
			MAP.put(4, "IV");
			MAP.put(5, "V");
			MAP.put(9, "IX");
			MAP.put(10, "X");
			MAP.put(40, "XL");
			MAP.put(50, "L");
			MAP.put(90, "XC");
			MAP.put(100, "C");
			MAP.put(400, "CD");
			MAP.put(500, "D");
			MAP.put(900, "CM");
			MAP.put(1000, "M");
		}

		public String convert(int intNumber) {
			if (intNumber == 0) {
				return "";
			}
			int largestSymbol = MAP.tailMap(intNumber)
					.firstKey();
			return MAP.get(largestSymbol)
					+ convert(intNumber - largestSymbol);
		}

	}


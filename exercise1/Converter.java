package exercise1;

public class Converter {
	
	private int number;
	private String[] singles = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", //
			"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eightteen", "nineteen" };	
	private String decens[] = { "","", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

	

	public Converter() {	}
	
	public String convert(int i) {
		this.number = i;
		if (i < 20) {
				return this.singles[number];
		} 
		if (i < 100) {
			return decens[i / 10] + ((i % 10 != 0) ? " " : "") + singles[i % 10];
		}
		if (i < 1000) {
			return singles[i / 100] + " hundred" + ((i % 100 != 0) ? " " : "") + convert(i % 100);
		}
		if (i < 1000000) {
			return convert(i / 1000) + " thousand" + ((i % 1000 != 0) ? " " : "") + convert(i % 1000);
		}

		if (i < 1000000000) {
			return convert(i / 1000000) + " million" + ((i % 1000000 != 0) ? " " : "") + convert(i % 1000000);
		}

		return convert(i / 1000000000) + " billion" + ((i % 1000000000 != 0) ? " " : "") + convert(i % 1000000000);

	} 

}






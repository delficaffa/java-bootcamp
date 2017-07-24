
public class Counter {
	private static Counter counter = null;
	private int transaction = 0;
	
	private Counter() {}
	
	public static Counter getInstance() {
		if (counter == null) {
			counter = new Counter();
		}
		return counter;
	}
	
	public int getId() {
		transaction++;
		return transaction;
	}
	
}


public class Highcomplexity implements Hospital {

	@Override
	public String type() {
		return "high";
	}

	@Override
	public int floors() {
		return 2;
	}

	@Override
	public int doctors() {
		return 30;
	}

	@Override
	public int nurses() {
		return 50;
	}

	@Override
	public int staff() {
		return 30;
	}

	@Override
	public Boolean dinningroom() {
		return true;
	}

	@Override
	public Boolean quirophan() {
		return true;
	}

	@Override
	public Boolean morgue() {
		return true;
	}

	@Override
	public Boolean intensiveCares() {
		return true;
	}

	private String booleanToString(Boolean bool) {
		if (bool) {
			return "yes";
		} else {
			return "no";
		}
	}

	public String toString() {
		return "floors: " + booleanToString(floors()) + "";
	}

}


public class Lowcomplexity implements Hospital {

	
	
	@Override
	public String type() {
		return "high";
	}
	
	@Override
	public int floors() {
		return 1;
	}
	
	@Override
	public int doctors() {
		return 15;
	}
	
	@Override
	public int nurses() {
		return 20;
	}
	
	@Override
	public int staff() {
		return 10;
	}
	
	@Override
	public Boolean dinningroom() {
		return true;
	}
	
	@Override
	public Boolean quirophan() {
		return false;
	}
	
	@Override
	public Boolean morgue() {
		return false;
	}
	
	@Override
	public Boolean intensiveCares() {
		return false;
	}
	

	String haveDinningroom(Boolean dinningroom) {
		if (dinningroom == true) {
			return "Yes";
		}else {
			return "No";
		}
	}
	
	String haveQuirophan(Boolean quirophan) {
		if (quirophan == true) {
			return "Yes";
		}else {
			return "No";
		}
	}
	
	String haveMorgue(Boolean morgue) {
		if (morgue == true) {
			return "Yes";
		}else {
			return "No";
		}
	}
	
	String haveIntensiveCares(Boolean intensiveCares) {
		if (intensiveCares == true) {
			return "Yes";
		}else {
			return "No";
		}
	}

	
	
}

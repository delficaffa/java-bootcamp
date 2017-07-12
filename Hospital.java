
public interface Hospital {
		
	String type();
	int floors();
	int doctors();
	int nurses();
	int staff(); //cleaning,administrative,etc
	Boolean dinningroom();
	Boolean quirophan();
	Boolean morgue();
	Boolean intensiveCares();
	
	/*
	String haveDinningroom(Boolean dinningroom) {
		if (dinningroom == true) {
			return "Yes";
		}else {
			return "No";
		}
	}
	
	String havequirophan(Boolean quirophan) {
		if (quirophan == true) {
			return "Yes";
		}else {
			return "No";
		}
	}
	
	String havemorgue(Boolean morgue) {
		if (morgue == true) {
			return "Yes";
		}else {
			return "No";
		}
	}
	
	String haveintensiveCares(Boolean intensiveCares) {
		if (intensiveCares == true) {
			return "Yes";
		}else {
			return "No";
		}
	}
	*/
} 
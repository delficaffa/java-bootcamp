
public class lowcomplexity extends hospital {

	
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
	public String dinningroom() {
		return "yes";
	}
	
	@Override
	public String quirophan() {
		return "no";
	}
	
	@Override
	public String morgue() {
		return "no";
	}
	
	@Override
	public String intensiveCares() {
		return "no";
	}
}

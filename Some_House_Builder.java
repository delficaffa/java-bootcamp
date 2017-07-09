
public class Some_House_Builder implements House_Builder {
	
	private _House _House;
	
	public Some_House_Builder() {
		_House = new _House();
	}
	
	@Override
	public void buildarea() {
		_House.setArea(20.11);
	}
	
	@Override
	public void buildkitchen() {
		_House.setKitchen(1);
	}
	
	@Override
	public void buildlivingroom() {
		_House.setLivingroom(0);
	}
	
	@Override
	public void builddinningroom() {
		_House.setDinningroom(1);
	}
	
	@Override
	public void buildbedroom() {
		_House.setBedroom(4);
	}
	
	@Override
	public void buildbathroom() {
		_House.setBathroom(2);
	}

	@Override
	public _House get_House() {
		return _House;
	}
	
}

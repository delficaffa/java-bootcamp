
public class SomeHouseBuilder implements HouseBuilder {
	
	private House House;
	
	public SomeHouseBuilder() {
		House = new House();
	}
	
	@Override
	public void buildarea() {
		House.setArea(20.11);
	}
	
	@Override
	public void buildkitchen() {
		House.setKitchen(1);
	}
	
	@Override
	public void buildlivingroom() {
		House.setLivingroom(0);
	}
	
	@Override
	public void builddinningroom() {
		House.setDinningroom(1);
	}
	
	@Override
	public void buildbedroom() {
		House.setBedroom(4);
	}
	
	@Override
	public void buildbathroom() {
		House.setBathroom(2);
	}

	@Override
	public House getHouse() {
		return House;
	}
	
}

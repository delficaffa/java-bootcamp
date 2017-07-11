public class PrincipalBuilder {
 
 	private HouseBuilder HouseBuilder = null;
 
 	public PrincipalBuilder(HouseBuilder HouseBuilder) {
 		this.HouseBuilder = HouseBuilder;
 	}
 
 	public void constructHouse() {
 		HouseBuilder.buildarea();
 		HouseBuilder.buildkitchen();
 		HouseBuilder.buildlivingroom();
 		HouseBuilder.builddinningroom();
 		HouseBuilder.buildbedroom();
 		HouseBuilder.buildbathroom();
 		
 	}
 
 	public House getHouse() {
 		return HouseBuilder.getHouse();
 	}
 
 }
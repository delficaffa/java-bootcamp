
public class Demo {

	public static void main(String[] args) {

		HouseBuilder HouseBuilder = new SomeHouseBuilder();
		PrincipalBuilder PrincipalBuilder = new PrincipalBuilder(HouseBuilder);
		PrincipalBuilder.constructHouse();
		House House = PrincipalBuilder.getHouse();
		System.out.println("The House have:\n" + House);

	}

}
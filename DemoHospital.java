
public class DemoHospital {

	public static void main(String[] args) {
		HospitalFactory HospitalFactory = new HospitalFactory();
		
		Hospital high = HospitalFactory.getHospital("high");
		System.out.println("A highcomplexity hospital have: \nFloors: " + high.floors() + "\nDoctors: " + high.doctors() + "\nNurses: " + high.nurses() + "\nStaff: " + high.staff() + "\nHave a dinningroom? " + high.dinningroom() + "\nHave a quirophan? " + high.quirophan() + "\nHave a morgue? " + high.morgue() + "\nHave intensive cares? " + high.intensiveCares());
		System.out.println(high.toString());
		Hospital low = HospitalFactory.getHospital("low");
		System.out.println("\nA lowcomplexity hospital have: \nFloors: " + low.floors() + "\nDoctors: " + low.doctors() + "\nNurses: " + low.nurses() + "\nStaff: " + low.staff() + "\nHave a dinningroom? " + low.dinningroom() + "\nHave a quirophan? " + low.quirophan() + "\nHave a morgue? " + low.morgue() + "\nHave intensive cares? " + low.intensiveCares());
	
	}
	
	
}

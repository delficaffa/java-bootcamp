
public class demoHospital {

	public static void main(String[] args) {
		hospitalFactory hospitalFactory = new hospitalFactory();
		
		hospital high = hospitalFactory.getHospital("yes");
		System.out.println("A highcomplexity hospital have: \nFloors: " + high.floors() + "\nDoctors: " + high.doctors() + "\nNurses: " + high.nurses() + "\nStaff: " + high.staff() + "\nHave a dinningroom? " + high.dinningroom() + "\nHave a quirophan? " + high.quirophan() + "\nHave a morgue? " + high.morgue() + "\nHave intensive cares? " + high.intensiveCares());

		hospital low = hospitalFactory.getHospital("no");
		System.out.println("\nA lowcomplexity hospital have: \nFloors: " + low.floors() + "\nDoctors: " + low.doctors() + "\nNurses: " + low.nurses() + "\nStaff: " + low.staff() + "\nHave a dinningroom? " + low.dinningroom() + "\nHave a quirophan? " + low.quirophan() + "\nHave a morgue? " + low.morgue() + "\nHave intensive cares? " + low.intensiveCares());
	
	}
	
	
}

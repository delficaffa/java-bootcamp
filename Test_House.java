
public class Test_House {
	
	public static void main(String[] args) {
		
		House H1 = new House();
		
		H1.setKitchen(1, 8.0);
		System.out.println(H1.getKitchen() + " Kitchen of " + H1.getArea() + " m2 total");
		
		H1.setLivingroom(0, 0.0);
		System.out.println(H1.getLivingroom() + " livingroom of " + H1.getArea() + " m2 total");
		
		H1.setDinningroom(1, 28.5);
		System.out.println(H1.getDinningroom() + " dinningroom of " + H1.getArea() + " m2 total");
		
		H1.setBedroom(2, 32.0);
		System.out.println(H1.getBedroom() + " bedroom of " + H1.getArea() + " m2 total");

		H1.setBathroom(2, 10.5);
		System.out.println(H1.getBathroom() + " bathroom of " + H1.getArea() + " m2 total");

		
	}

}

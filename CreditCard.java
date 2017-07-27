public class CreditCard implements PaymentStrategy {
	
	private String name;
	private String cardNumber;

	public CreditCard(String nm, String cn) {
		this.name = nm;
		this.cardNumber = cn;
	}
		
	@Override
	public void pay(double amount) {
		System.out.println("$"+ amount + " paid using credit card.");
		System.out.println("Thanks for your purchase! ");
	}
	

}

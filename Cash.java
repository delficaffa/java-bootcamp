
public class Cash implements PaymentStrategy{
		
	@Override
	public void pay (double amount) {
		System.out.println("$"+amount+ " paid in cash.");
		System.out.println("Thanks for your purchase! ");
	}
	
}
															
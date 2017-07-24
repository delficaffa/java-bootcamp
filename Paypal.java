
public class Paypal implements PaymentStrategy {

	String email;
	String password;
	
	public Paypal(String em, String psw) {
		
		this.email = em;
		this.password = psw;
	}
	
	@Override
	public void pay (double	 amount) {
		System.out.println("$"+amount + " paid using Paypal.");
		System.out.println("Thanks for your purchase! ");
	}
}




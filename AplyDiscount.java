import java.util.List;

public class AplyDiscount {

	private DiscountStrategy discountStrategy;
	private double discount;
	
	public AplyDiscount(PaymentStrategy type, List<Item> items){
		
		if (type instanceof Paypal) {
			this.discountStrategy = new PaypalDiscount();
		}else if (type instanceof Cash) {
			this.discountStrategy = new CashDiscount();
		}else if (type instanceof CreditCard){
			this.discountStrategy = new CreditCardDiscount();
		}
		
		this.discount = this.discountStrategy.discountS(items);
	}
		public DiscountStrategy getDiscountStrategy() {
			return discountStrategy;
		}
		
		public double getDiscount() {
			return discount;
		}
}
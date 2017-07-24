import java.util.List;

public class CreditCardDiscount implements DiscountStrategy{
	
	 @Override
	 public double discountS(List<Item> items) {
		 int less = 0;
		 for (Item item : items) {
			 less += item.getPrice();
		 }
		double amount = less - (10 * less/100);
		return amount;
	 }

}


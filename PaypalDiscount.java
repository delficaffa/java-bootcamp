import java.util.List;

public class PaypalDiscount implements DiscountStrategy{
	
	
	@Override
	public double discountS(List<Item> items) {
			double cheapest = 0;
			double less = 0;
			double cost = 0;
			for(Item item : items) {
				cost = item.getPrice();
				if(cheapest == 0 || cost < cheapest) {	
					cheapest = cost;
				}
				less += cost;
			}
			less -= cheapest;
			return less;
		}

}

import java.util.List;

public class CashDiscount implements DiscountStrategy{	
	
	@Override
	public double discountS(List<Item> items) {
		double expensive = 0;
		double less = 0;
		double cost = 0;
		for(Item item : items) {
			cost = item.getPrice();
			if(cost > expensive) {	
				expensive = cost;
			}
			less += cost;
		}
		less -= (expensive*90/100);
		return less;
	}
}

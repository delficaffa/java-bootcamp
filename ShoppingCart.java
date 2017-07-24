import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	
	List<Item> items;
	private PaymentStrategy paymentMethod;
	private AplyDiscount discountMethod;
	private Counter counter;
	
	
	public ShoppingCart() {
		this.items =  new ArrayList<Item>();
		counter = counter.getInstance();
	}
	
	public void setPaymentMethod(PaymentStrategy paymentStrategy) {
		this.paymentMethod = paymentStrategy;
	}
	
	public void addItem(Item item){
		this.items.add(item);
	}
	
	public void removeItem(Item item){
		this.items.remove(item);
	}
	
	public void showItems() {
		for (Item item : items) { 
			System.out.println("° " + item);

		}
	}
	
	public double calculateTotal(){
		 double sum = 0;
		for(Item item : items){
			sum += item.getPrice();
		}
		return sum;
	}
	
	public void pay() {
		discountMethod = new AplyDiscount(paymentMethod, items);
		double amountWithDiscount = discountMethod.getDiscount();
		System.out.println("** Transaction ID 0000" + counter.getId() + " **");
		paymentMethod.pay(amountWithDiscount);
	}

	
}
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	
	List<Item> items;
	private PaymentStrategy paymentMethod;
	private ApplyDiscount discountMethod;
	private Counter counter;
	private Email email;
	private MailStation mailStation;
	
	
	public ShoppingCart() {
		MailStation mailStation = new MailStation ();
		this.mailStation = mailStation;
		this.items =  new ArrayList<Item>();
		counter = counter.getInstance();
	}
	
	public void setPaymentMethod(PaymentStrategy paymentStrategy) {
		this.paymentMethod = paymentStrategy;
	}
	
	public void addItem(Item item){
		this.items.add(item);
		mailStation.sendEmail(new Email("new item added"));
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
		discountMethod = new ApplyDiscount(paymentMethod, items);
		double amountWithDiscount = discountMethod.getDiscount();
		System.out.println("** Transaction ID 0000" + counter.getId() + " **");
		paymentMethod.pay(amountWithDiscount);
		System.out.print("\n");
		mailStation.sendEmail(new Email("new transaction"));

		
	}

	public void changeItemPrice(String id, double price) {
		for (Item item : items) {
			if (item.getIdItem() == id) {
				item.setPrice(price);
				mailStation.sendEmail(new Email("new item price"));
				break;
			}
		}
	}

	public void setMailStation(MailStation mailStation) {
		this.mailStation = mailStation;
		
	}
	
}
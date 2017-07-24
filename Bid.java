
public class Bid implements Offers{
	private String id;
	private double price;
	
	public Bid(Item item) {
		this.id = item.getIdItem();
		this.price = item.getPrice();	
	}
	
	@Override
	public void showItems() {
		System.out.println("° " + id +": $" + price);
	}
}


public class Item{
	private String idItem;
	private double price;
	
	public Item(String id, double p) {
		this.idItem = id;
		this.price = p;
	}
	
	public String getIdItem() {
		return idItem;
	}
	
	public double getPrice() {
		return price;
	}
	
public String toString() {
	return idItem + ": $" + price;
}

}
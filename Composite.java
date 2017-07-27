import java.util.ArrayList;
import java.util.List;

public class Composite implements Offers{
	List<Offers> offer = new ArrayList<Offers>();
	String id;
	double price;

	
	public Composite(String id, double price) {
		this.id = id;
		this.price = price;

	}
	
	
	@Override
	public void showItems() {
		System.out.println("** Offer " + id + ": $" + price + " **");
		for(Offers offers : offer) {
			offers.showItems();			
		}	
	}	
	
	public void add(Offers offers) {
		offer.add(offers);
	}
	
	public void remove(Offers offers) {
		offer.remove(offers);
	}
	
	public List<Offers> getOffer(){
		return offer;
	}
	
	public Offers getOffers (int index) {
		return offer.get(index);
	}
	
	
	
}

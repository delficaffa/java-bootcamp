import java.util.ArrayList;
import java.util.List;

public class OffersComposite implements Offers {

	List<Offers> offer = new ArrayList<Offers>();
	String id;
	double price;
	MailStation mailStation;
	
	public OffersComposite(String id, double price, MailStation mailStation) {
		this.id = id;
		this.price = price;
		this.mailStation = mailStation;
		mailStation.sendEmail(new Email("new offer created"));

	}
	
	
	@Override
	public void showItems() {
		System.out.println("\n** Offer " + id + ": $" + price + " **");
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

package Delfii.Bootcamp.topic4;

import java.util.List;
import javax.jws.WebService;

@WebService

public class ShoppingCartWebService implements ShoppingCartService {

	ShoppingCartService cart = (ShoppingCartService) new ShoppingCart();
	

	public void addItem(Item item) {
		cart.addItem(item);
	}

	public void removeItem(Item item) {
		cart.removeItem(item);
	}

	public void pay() {
		cart.pay();
	}

	public double calculateTotal() {
		return cart.calculateTotal();
	}

	public List<Item> getItems() {
		return cart.getItems();
	}
}

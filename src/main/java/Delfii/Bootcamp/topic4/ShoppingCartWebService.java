package Delfii.Bootcamp.topic4;

import java.util.List;
import javax.jws.WebService;

@WebService

public class ShoppingCartWebService implements ServiceShoppingCart {

	ServiceShoppingCart cart = new ShoppingCart();
	
	@Override
	public void addItem(Item item) {
		cart.addItem(item);
	}

	@Override
	public void removeItem(Item item) {
		cart.removeItem(item);
	}

	@Override
	public void pay() {
		cart.pay();
	}

	@Override
	public double calculateTotal() {
		return cart.calculateTotal();
	}

	@Override
	public List<Item> getItems() {
		return cart.getItems();
	}
}

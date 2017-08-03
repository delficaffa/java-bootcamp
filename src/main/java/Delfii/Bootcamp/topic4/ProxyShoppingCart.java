package Delfii.Bootcamp.topic4;

import java.util.List;

public class ProxyShoppingCart implements ServiceShoppingCart{

	ServiceShoppingCart shoppingCart;
	
	protected ProxyShoppingCart(ServiceShoppingCart cart) {
		this.shoppingCart = cart;
	}

	@Override
	public void addItem(Item item) {
		shoppingCart.addItem(item);	
	}

	@Override
	public void removeItem(Item item) {
		shoppingCart.removeItem(item);	
	}

	@Override
	public void pay() {
		shoppingCart.pay();
	}

	@Override
	public double calculateTotal() {
		return shoppingCart.calculateTotal();
	}

	@Override
	public List<Item> getItems() {
		return shoppingCart.getItems();
	}
	
}

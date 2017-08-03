package Delfii.Bootcamp.topic4;

import java.util.List;

public class ProxyShoppingCart implements ShoppingCartService{

	ShoppingCartService shoppingCart;
	
	protected ProxyShoppingCart(ShoppingCartService cart) {
		this.shoppingCart = cart;
	}


	public void addItem(Item item) {
		shoppingCart.addItem(item);	
	}

	
	public void removeItem(Item item) {
		shoppingCart.removeItem(item);	
	}


	public void pay() {
		shoppingCart.pay();
	}


	public double calculateTotal() {
		return shoppingCart.calculateTotal();
	}


	public List<Item> getItems() {
		return shoppingCart.getItems();
	}
	
}

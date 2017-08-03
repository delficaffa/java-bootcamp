package Delfii.Bootcamp.topic4;

import java.util.List;

public class ShoppingCartJmsClient implements ShoppingCartService{
	
	ShoppingCartService jmsObject;

	public ShoppingCartJmsClient() {
	}


	public void addItem(Item item) {
		jmsObject.addItem(item);
	}


	public void removeItem(Item item) {
		jmsObject.removeItem(item);
	}


	public void pay() {
		jmsObject.pay();
	}


	public double calculateTotal() {
		return jmsObject.calculateTotal();
	}


	public List<Item> getItems() {
		return jmsObject.getItems();
	}

}

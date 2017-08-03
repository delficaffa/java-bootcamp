package Delfii.Bootcamp.topic4;

import java.util.List;

public class ShoppingCartJmsClient implements ServiceShoppingCart{
	
	ServiceShoppingCart jmsObject;

	public ShoppingCartJmsClient() {
	}

	@Override
	public void addItem(Item item) {
		jmsObject.addItem(item);
	}

	@Override
	public void removeItem(Item item) {
		jmsObject.removeItem(item);
	}

	@Override
	public void pay() {
		jmsObject.pay();
	}

	@Override
	public double calculateTotal() {
		return jmsObject.calculateTotal();
	}

	@Override
	public List<Item> getItems() {
		return jmsObject.getItems();
	}

}

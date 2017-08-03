package Delfii.Bootcamp.topic4;

import java.util.List;

public interface ServiceShoppingCart {
	
	void addItem(Item item);

	void removeItem(Item item);

	double calculateTotal();
	
	void pay();

	List<Item> getItems();

}

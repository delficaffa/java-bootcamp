package Delfii.Bootcamp.topic4;

import java.util.List;


public class ShoppingCartWebServiceClient implements ShoppingCartService{

	ShoppingCartService webService;  
	
	

	public void addItem(Item item) {
		webService.addItem(item);	
	}

	public void removeItem(Item item) {
		webService.removeItem(item);
	}


	public void pay() {
		webService.pay();
	}


	public double calculateTotal() {
		return webService.calculateTotal();
	}


	public List<Item> getItems() {
		return webService.getItems();
	}


}

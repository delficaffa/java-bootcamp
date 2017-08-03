package Delfii.Bootcamp.topic4;

public class ShoppingCart{
	 
	 public static void main(String[] args) {  

		Item item1 = new Item("Fuit",20);
		Item item2 = new Item("Book",50);

		ShoppingCartService cart1 = ShoppingCartFactory.getLocalService();
		cart1.addItem(item1);
		
		ShoppingCartService cart2 = ShoppingCartFactory.getRemoteServiceUsingWebService();
		cart2.addItem(item2);
		
		ShoppingCartService cart3 = ShoppingCartFactory.getRemoteServiceUsingJms(); 
		cart3.addItem(item1);	
		
	 }


}


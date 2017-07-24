import java.util.Scanner;

public class ShoppingCartTest {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		Scanner sc = new Scanner(System.in);
		int option;
		
		System.out.print("** AUDIO PLAYER **\n");
		Song song = new Song();
		song.play();
		song.pause();
		song.stop();
		song.play();
		System.out.print("\n");
		
		
		Item item1 = new Item("Fuit",20);
		Item item2 = new Item("Book",50);
		Item item3 = new Item("Toys",30);
		Item item4 = new Item("Keyboard",80);
		Item item5 = new Item("Mouse",50);
		
		cart.addItem(item1);
		cart.addItem(item2);
		cart.addItem(item3);

		Composite composite1 = new Composite("Technology",100);
		composite1.add(new Bid(item4));
		composite1.add(new Bid(item5));
		
		composite1.showItems();
		System.out.println("\nYour shopping cart contains:");
		cart.showItems();
		System.out.println("° Total: $" + cart.calculateTotal());
		System.out.println("\nPlease, select the payment method.");
		System.out.println("1 - CASH\n2 - PAYPAL\n3 - CREDIT CARD\n");
		option = sc.nextInt();
		
		switch(option) {
			case 1:
				cart.setPaymentMethod(new Cash());
				cart.pay();
				break;
			case 2:
				cart.setPaymentMethod(new Paypal(" 1234@example.com ", " 123abc "));
				cart.pay();
				break;
			case 3:
				cart.setPaymentMethod(new CreditCard("Caffa Delfina", "123456789123"));
				cart.pay();
				break;	
			default: 
				System.out.println("ERROR! Invalid method");
		}
		
		
	}
}

package Delfii.Bootcamp.topic4;

public class ShoppingCartFactory {

	public static ShoppingCartService getLocalService() {
		return new ShoppingCart();
	}

	public static ShoppingCartService getRemoteServiceUsingJms() {
		return new ProxyShoppingCart(new ShoppingCartJmsClient());
	}

	public static ShoppingCartService getRemoteServiceUsingWebService() {
		return new ProxyShoppingCart(new ShoppingCartWebServiceClient());
	}
	
}

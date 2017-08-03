package Delfii.Bootcamp.topic4;

public class ShoppingCartFactory {

	public static ServiceShoppingCart getLocalService() {
		return new ShoppingCart();
	}

	public static ServiceShoppingCart getRemoteServiceUsingJms() {
		return new ProxyShoppingCart(new ShoppingCartJmsClient());
	}

	public static ServiceShoppingCart getRemoteServiceUsingWebService() {
		return new ProxyShoppingCart(new ShoppingCartWebServiceClient());
	}
	
}

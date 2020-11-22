package javastudy.shop;

public class ShopLauncher {

	public static void main(String[] args) {
		IShop shop = new MyShop();
		shop.setTitle("My Naver Mall");
		shop.genUser();
		shop.genProduct();
		shop.start();
	}
}

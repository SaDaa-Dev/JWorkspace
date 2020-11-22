package javastudy.shop;

public abstract class Product {
	String pname;
	int price;
	
	public void printDetail() {
		System.out.print("상품명: "+pname+" , ");
		System.out.print("가격: "+price+" , ");	
		printExtra();
	}
	public abstract void printExtra();
}

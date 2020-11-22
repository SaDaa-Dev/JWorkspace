package javastudy.shop;

public class CellPhone extends Product {
	public String pd;
	
	public CellPhone(String pname, int price, String pcom) {
		this.pname = pname;
		this.price = price;
		pd = pcom;
	}

	@Override
	public void printExtra() {
		// TODO Auto-generated method stub
		System.out.printf("특징 : %s \n", pd);
	}
}

package javastudy.shop;

public class SmartTV extends Product{
	public String pd;

	public SmartTV(String pname, int price, String pdetail) {
		this.pname = pname;
		this.price = price;
		pd = pdetail;
	}

	@Override
	public void printExtra() {
		// TODO Auto-generated method stub
		System.out.printf("특징 : %s \n", pd );
	}
}

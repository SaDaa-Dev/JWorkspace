package cgame;

public class CarGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();
		c1.setColor("RED");
		c1.setModel("����ҳ�Ÿ");
		c1.setPower(180);
		
		Car c2 = new Car("BLUE","BMW 520", 210);
		
		c1.go();
		c2.go();
		
		
	}

}

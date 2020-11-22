package pgame;

public class RobotDog extends Robot implements Pet{

	@Override
	public void bark() {
		System.out.println("Woof Woof~~");
		
	}
	
	@Override
	void charging() {
		System.out.println(getName()+"go to charging station");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RobotDog rd = new RobotDog();
		rd.setName("robo dog");
		rd.bark();
		rd.move();
		rd.charging();
	}

}

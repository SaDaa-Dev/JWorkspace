package gungame;

public class RobotDog extends Robot implements Pet {
	
	
	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("Woof~ Woof~");
	}

	@Override
	void move() {
		// TODO Auto-generated method stub
		super.move();
		
	}

	@Override
	void charging() {
		// TODO Auto-generated method stub
		System.out.println(getName()+"의 충전을 시작합니다!");
		
	}

	public static void main(String[] args) {	
		
		RobotDog rd = new RobotDog(); 
		rd.setName("해적");
		rd.bark();
		rd.move();
		rd.charging();
	
	}
}

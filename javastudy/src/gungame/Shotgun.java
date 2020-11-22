package gungame;

public class Shotgun extends Gun {


	public Shotgun(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		
	
	}

	public void shot() {
		super.shot();
		bullet -= 1;
		System.out.printf("%s 발사 ! 남은 총알 수 : %d", name, bullet);
	}
	

	
}

package gungame;

public class Gun {
	protected String name;
	protected int bullet;
	
	
	public void shot() {
		System.out.println(name+"shot!");
		bullet -= 1;
	}
	
	public Gun(String name) {
		bullet = 10;
		this.name = name;
	}

}

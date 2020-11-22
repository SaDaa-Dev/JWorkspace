package ggame;

public class Gun {
	protected String model;
	protected int bulletCount;
	
	public void fire() {
		System.out.println(model + "=>");
		bulletCount -= 1;
	}
	
	public Gun(String model) {
		bulletCount = 10;
		this.model = model;
	}
}



package ggame;

public class GunGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gun gun = new ShotGun("S12K");
		Gun gun1 = new AssaultRifle("M416");
		
		gun.fire();
		gun1.fire();

	}

}

package gungame;

public class Gungame {
	
	public static void main(String[] args){
		
		Gun sg = new Shotgun("s12k");
		Gun rg = new Assult("M4");
		
		sg.shot();
		System.out.println("\n");
		
		rg.shot();
		
	}

}

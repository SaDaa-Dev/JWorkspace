package gungame;

abstract class Robot {
	private String name;
	
	void move() {
		System.out.println("�κ���사랑�����Դϴ�!");
	}
	
	abstract void charging();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}

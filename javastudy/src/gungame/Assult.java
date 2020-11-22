package gungame;

public class Assult extends Gun{

	public Assult(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		bullet = 40;
	}

	@Override
	public void shot() {
		// TODO Auto-generated method stub
		super.shot();
		bullet -= 5;
		System.out.printf("%s �߻� ! ���ㅇㄴㄹ� �Ѿ� �� : %d", name, bullet);
	}
	
	
	

}

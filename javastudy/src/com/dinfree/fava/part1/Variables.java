package com.dinfree.fava.part1;

public class Variables {
	// ������� , �ν��Ͻ� ����
	int num1;
	
	// ������� , Ŭ���� ����
	static int num2;
	
	public void printName(String name) { //�޼ҵ� ����
		//��������
		String prtMsg = name + " hello!";
		System.out.println(prtMsg);
	}
	
	public static void main(String[] args) {
		Variables mc = new Variables();
		mc.num1 = 100;
		Variables.num2 = 50;
		
		System.out.printf("%d, %d \n",mc.num1,Variables.num2);
		System.out.println(Variables.num2);
		
		
		//���ڷ� �Ű����� ����
		mc.printName("ȫ�浿");
	}

}

package com.dinfree.fava.part1;

public class Methods {
	String name;
	
	//������ �޼ҵ� (�ʱ�ȭ �۾��� ���� ����)
	Methods() { 
		name = "ȫ�浿";
		System.out.printf("#������: %s \n", name);
	}
	
	void printName(){
		System.out.printf("#printName(): %s \n", name);	
	}
	
	//�޼ҵ� �����ε� ( ���� �̸��� �޼ҵ� ������ �̿� ���� )
	void printName(String name) {
		System.out.printf("#printName(String name): %s \n", name);
	}
	
	void printName(String...name) {  //�������� -> ��� �������� ���� �� �𸥴�
		System.out.printf("#printName(String...name): %s \n", name);
		for(String s : name) {
			System.out.println(s);
		}
	}
	
	int calc(int num1 , int num2) {
		return num1+num2;
	}
	
	void printInfo(String name, String major, int num){
		System.out.printf("�̸�: %s , �а�: %s , �й�: %d \n",name,major,num);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods m = new Methods();
		m.printName();
		m.printName("��浿");
		m.printName("�ȳ�","����","����");
		System.out.printf("#calc(int num1,int num2) : %d \n" , m.calc(22, 33));
		m.printInfo("������", "��ǻ�Ͱ��а�", 201839492);
	}
}

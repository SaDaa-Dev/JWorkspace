package com.dinfree.fava.part1;

public class Methods {
	String name;
	
	//생성자 메소드 (초기화 작업을 자주 수행)
	Methods() { 
		name = "홍길동";
		System.out.printf("#생성자: %s \n", name);
	}
	
	void printName(){
		System.out.printf("#printName(): %s \n", name);	
	}
	
	//메소드 오버로딩 ( 동일 이름의 메소드 여러개 이용 가능 )
	void printName(String name) {
		System.out.printf("#printName(String name): %s \n", name);
	}
	
	void printName(String...name) {  //가변인자 -> 몇개의 변수들이 들어올 지 모른다
		System.out.printf("#printName(String...name): %s \n", name);
		for(String s : name) {
			System.out.println(s);
		}
	}
	
	int calc(int num1 , int num2) {
		return num1+num2;
	}
	
	void printInfo(String name, String major, int num){
		System.out.printf("이름: %s , 학과: %s , 학번: %d \n",name,major,num);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods m = new Methods();
		m.printName();
		m.printName("김길동");
		m.printName("안녕","나는","하하");
		System.out.printf("#calc(int num1,int num2) : %d \n" , m.calc(22, 33));
		m.printInfo("정병찬", "컴퓨터공학과", 201839492);
	}
}

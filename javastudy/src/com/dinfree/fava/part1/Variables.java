package com.dinfree.fava.part1;

public class Variables {
	// 멤버변수 , 인스턴스 변수
	int num1;
	
	// 멤버변수 , 클래스 변수
	static int num2;
	
	public void printName(String name) { //메소드 선언
		//지역변수
		String prtMsg = name + " hello!";
		System.out.println(prtMsg);
	}
	
	public static void main(String[] args) {
		Variables mc = new Variables();
		mc.num1 = 100;
		Variables.num2 = 50;
		
		System.out.printf("%d, %d \n",mc.num1,Variables.num2);
		System.out.println(Variables.num2);
		
		
		//인자로 매개변수 전달
		mc.printName("홍길동");
	}

}

package com.dinfree.fava.part1;

public class Operator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 50;
		System.out.printf("������ num1 : %d , %s\n",num, Integer.toBinaryString(num));
		
		int result = num >> 1;
		System.out.printf("result : %d , %s \n",result, Integer.toBinaryString(result));
		
		int pwd = 123456;
		int encPwd, decPwd;
		int key = 0x1A253B65;
		
		System.out.println("��ȣȭ �� ��й�ȣ :"+pwd);
		encPwd = pwd ^ key;
		System.out.println("��ȣȭ �� ��й�ȣ :"+encPwd);

		decPwd = encPwd ^ key;
		System.out.println("��ȣȭ �� ��й�ȣ :"+ decPwd);

	}

}

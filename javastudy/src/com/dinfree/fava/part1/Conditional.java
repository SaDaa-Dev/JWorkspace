package com.dinfree.fava.part1;

import java.util.Scanner;

public class Conditional {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conditional con = new Conditional();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.printf("#�޴��� Ȯ���ϼ���(1:�α��� 2:����Ȯ�� 3:x����)==>");
			String sel = scan.next();
			
			switch(sel) {
			case "1" : con.login(); break;
			case "2" : con.check(); break;
			case "3" : System.exit(0);
				default : System.out.println("�߸��� �Է��Դϴ�.");
			
			}
			
		}
		
	}

	private void login() {
		Scanner scan = new Scanner(System.in);
		System.out.println("#���̵� �Է��ϼ���");
		String uname = scan.next();
		
		System.out.println("#��й�ȣ�� �Է��ϼ���");
		String pwd = scan.next();
		
		if ((uname.equals("hong"))&&(pwd.equals("1234"))) {
			System.out.println("����Ȯ��  ->> �α��� ���� !");
		}else {
			System.out.println("���̵� ��й�ȣ�� Ʋ�Ƚ��ϴ�.1");
		}
				
	}
	
	private void check() {
		Scanner scan = new Scanner(System.in);
		int cnt = 10;
		String msg = cnt > 0 ? "���ο� ������ �ֽ��ϴ�" : "���ο� ������ �����ϴ�" ;
		System.out.println(msg);
		
	}
	


}

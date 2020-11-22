package com.dinfree.fava.part1;

import java.util.Scanner;

public class Conditional {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conditional con = new Conditional();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.printf("#메뉴를 확인하세요(1:로그인 2:쪽지확인 3:x종료)==>");
			String sel = scan.next();
			
			switch(sel) {
			case "1" : con.login(); break;
			case "2" : con.check(); break;
			case "3" : System.exit(0);
				default : System.out.println("잘못된 입력입니다.");
			
			}
			
		}
		
	}

	private void login() {
		Scanner scan = new Scanner(System.in);
		System.out.println("#아이디를 입력하세요");
		String uname = scan.next();
		
		System.out.println("#비밀번호를 입력하세요");
		String pwd = scan.next();
		
		if ((uname.equals("hong"))&&(pwd.equals("1234"))) {
			System.out.println("인증확인  ->> 로그인 성공 !");
		}else {
			System.out.println("아이디나 비밀번호가 틀렸습니다.1");
		}
				
	}
	
	private void check() {
		Scanner scan = new Scanner(System.in);
		int cnt = 10;
		String msg = cnt > 0 ? "새로운 쪽지가 있습니다" : "새로운 쪽지가 없습니다" ;
		System.out.println(msg);
		
	}
	


}

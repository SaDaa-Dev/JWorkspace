package webServer;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		
		try {
			Socket s = new Socket("192.168.1.11", 5000);
			System.out.println("#클라이언트 실행");
			PrintWriter pw = new PrintWriter(s.getOutputStream());
			
			Scanner scan = new Scanner(System.in);
			System.out.print("Message Input : ");
			String msg = scan.next();
			pw.println("[정병찬]" + msg);
			pw.println("안녕하세요");
		
			pw.close();
			s.close();
			System.out.println("# 클라이언트 종료");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}

package Inout;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class AddrBook {
	public static void main(String[] args) { 
		byte[] buffer = new byte[16384]; // 파일을 읽고 저장할 배열 선언 
		
		System.out.println("----메모장 프로그램----");
		System.out.println("저장할 파일명을 입력하세요");
		Scanner scan = new Scanner(System.in);
		String filename = scan.next();
		
		String s;
		try {
			BufferedReader br = new BufferedReader(new FileReader("addrbook.csv"));
			BufferedWriter bw = new BufferedWriter(new FileWriter(filename));
			
			while((s = br.readLine()) != null) {
				String[] a = s.split(","); // "," 를 기준으로 자르기
				bw.write(a[0]+" "+a[1]+" "+a[2]+"\n"); //새로운 파일에 잘려진 문자열 저장
			}

			br.close();
			bw.close();
			scan.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("----프로그램 종료----");
		System.out.println(filename+"으로 저장이 되었습니다!!");
	}


}

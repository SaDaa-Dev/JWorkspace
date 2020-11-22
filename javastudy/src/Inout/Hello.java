package Inout;

import java.io.InputStream;
import java.io.OutputStream;

public class Hello {
	public static void main(String[] args) {
		InputStream in = System.in;
		OutputStream out = System.out;
		
		int input;
		
		try {
			System.out.print("## Input 1~3 character : ");
			
			input = in.read();
			System.out.println("## 1byte read and print");
			System.out.println(input);
			
			out.close();
					
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}

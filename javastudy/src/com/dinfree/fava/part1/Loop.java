package com.dinfree.fava.part1;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("#201839492 ��ǻ�Ͱ��а� ������ - ������");
		//������
		for(int i = 1 ; i <= 9 ; i++) {
			System.out.printf("#%d�� \n",i);
			for(int j = 1 ; j <= 9 ; j++) {
				System.out.printf("%d X %d = %d || ", i, j, i*j);
			}
			System.out.println("\n");
		}
		
	}
	
}

package com.dinfree.fava.part1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("#1. �迭 ���� �ʱ�ȭ	");
		int[] score = { 95, 100, 87, 91 };
		score[2] = 90;
		
		for (int s : score) {
			System.out.println(s);
		}
		
		System.out.println("# 2. Arrays �޼���");
		System.out.println(Arrays.toString(score));
		String[] cars = {"hyundai", "bmw", "benz", "toyota"};
		List<String> car_list = Arrays.asList(cars);
		
		System.out.println(car_list);
		System.out.println(car_list.get(1)); //����Ʈ ���� �ҷ����� �κ�
		
		
		System.out.println("# 2. Arrays �޼��� : ����");
		Arrays.sort(cars); // ������������ ����
		System.out.println(Arrays.asList(cars));
		
		Arrays.parallelSort(cars, Collections.reverseOrder());
		System.out.println(Arrays.asList(cars));
		
		Arrays.parallelSort(cars, 0, 2);
		System.out.println(Arrays.asList(cars));
		
		System.out.println("# 4. ������ �迭");
		int [][][] allScores = {
			{
					{90, 85, 70, 55, 60},
					{96, 88, 81, 91, 74},
					{96, 88, 81, 91, 75},
					{96, 88, 81, 91, 75}
					
			},
			{
					{96, 88, 81, 91, 75},
					{96, 88, 81, 91, 75},
					{96, 88, 81, 91, 75},
					{96, 88, 81, 91, 75}
			
			},
			{
					{96, 88, 81, 91, 75},
					{96, 88, 81, 91, 75},
					{96, 88, 81, 91, 75},
					{96, 88, 81, 91, 75}
			}
		};
		
		
		System.out.println(allScores.length);
		
	}
}

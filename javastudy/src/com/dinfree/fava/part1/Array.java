package com.dinfree.fava.part1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("#1. 배열 선언 초기화	");
		int[] score = { 95, 100, 87, 91 };
		score[2] = 90;
		
		for (int s : score) {
			System.out.println(s);
		}
		
		System.out.println("# 2. Arrays 메서드");
		System.out.println(Arrays.toString(score));
		String[] cars = {"hyundai", "bmw", "benz", "toyota"};
		List<String> car_list = Arrays.asList(cars);
		
		System.out.println(car_list);
		System.out.println(car_list.get(1)); //리스트 값을 불러오는 부븐
		
		
		System.out.println("# 2. Arrays 메서드 : 정렬");
		Arrays.sort(cars); // 오름차순으로 정렬
		System.out.println(Arrays.asList(cars));
		
		Arrays.parallelSort(cars, Collections.reverseOrder());
		System.out.println(Arrays.asList(cars));
		
		Arrays.parallelSort(cars, 0, 2);
		System.out.println(Arrays.asList(cars));
		
		System.out.println("# 4. 다차원 배열");
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

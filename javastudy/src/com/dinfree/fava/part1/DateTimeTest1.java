package com.dinfree.fava.part1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeTest1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		LocalDate d1 = LocalDate.now();    //현재 시간 자동 입력
		LocalDate d2 = LocalDate.of(2020, 11, 05);  //현재 날짜 직접 저장
		
		LocalTime t1 = LocalTime.now(); //현재 시간 자동
		LocalTime t2 = LocalTime.of(7, 20, 20); //현재 시간 수동
		
		System.out.printf("LocalDate.now() : %s \n", d1);
		System.out.printf("LocalDate.of(2020, 11, 05) : %s \n", d2);
		
		System.out.printf("LocalTime.now() : %s \n", t1);
		System.out.printf("LocalTime.of(7, 20, 20) : %s \n", t2);
		
		LocalDateTime dt1 = LocalDate.now().atTime(LocalTime.MIDNIGHT);
		LocalDateTime dt2 = LocalDate.now().atTime(LocalTime.MAX);
		
		System.out.printf("LocalDateTime dt1 = LocalDate.now().atTime(LocalTime.MIDNIGHT) : %s \n", dt1);
		System.out.printf("LocalDateTime dt2 = LocalDate.now().atTime(LocalTime.MAX) : %s \n", dt2);
		
	}

}

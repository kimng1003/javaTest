package com.javaStudy.ch4;

import java.util.Scanner;

public class basicAp2 {
	
	public static void main(String[] args) {
		
	
		System.out.println("section01.conditional.level01.Ap2"); 
	
	/* 정수를 입력 받아 그 수가 짝수인지 홀수인지 판단해서 결과를 출력하세요
	 * 짝수인 경우 "짝수다." 출력, 홀수인 경우 "홀수다." 출력 
	 * 
	 * -- 입력 예시 --
	 * 정수를 하나 입력하세요 : 5
	 * 
	 * -- 출력 예시 --
	 * 홀수다.
	 * */
	
	Scanner sc = new Scanner(System.in);
	System.out.println("정수 입력: ");	
	int num2 = sc.nextInt();
	
	if (num2 % 2 == 0) {
		System.out.println("입력한 수 " + num2 + "은(는) 짝수이다.");
	} else {
		System.out.println("입력한 수 " + num2 + "은(는) 홀수이다.");
	}
	
	}
}
	





	
	
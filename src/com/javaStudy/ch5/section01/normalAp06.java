package com.javaStudy.ch5.section01;

import java.util.Arrays;

public class normalAp06 {
	public static void main(String[] args) {
	
	/* 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
	 * 1 ~ 10 사이의 난수를 발생시켜 배열에 초기화 후
	 * 배열 전체 값과 그 값 중에서 최대값과 최소값을 찾아서 출력하세요.
	 * 
	 * =========== 출력 ============
	 * 2 10 5 2 3 7 3 7 9 7
	 * 최대값 : 10
	 * 최소값 : 2
	 * */

		int[] iarr = new int[10];
		
		int min = 10;
		int max = 1;	
		
		
		for(int i = 0; i < iarr.length; i++) {
			iarr[i] = (int)(Math.random() * 10 + 1);		
			
			if(iarr[i] > max) {
				max = iarr[i];
			}
		
			if(iarr[i] < min) {
				min = iarr[i];
			}
			System.out.print(iarr[i] + " ");
		}
		System.out.println();
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	
	}
}


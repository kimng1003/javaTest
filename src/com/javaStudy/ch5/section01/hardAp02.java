package com.javaStudy.ch5.section01;

public class hardAp02 {
	public static void main(String[] args) {
		
		/* 로또번호 생성기 
		 * 6칸 짜리 정수 배열을 하나 생성하고
		 * 1부터 45까지의 중복되지 않는 난수를 발생시켜 각 인덱스에 대입한 뒤
		 * 오름차순 정렬하여 출력하세요
		 * */
		
		// 6칸 정수 배열 생성
		int[] num = new int[6];
		
		// 난수 발생 (1~45) 인덱스 대입
		label:
		for(int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random() * 45 + 1);
			for(int j = 0; j < i; j++) {
				if(num[i] == num[j]) {
					i--;
					continue label;
				}
			}
			
		}
		
		int temp = 0;
		for(int i = 1; i < num.length; i++) {
			for(int j = 0; j < num.length; j++) {
				if(num[i] < num[j]){
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < num.length; i++) {
		System.out.print(num[i] + " ");
		}
	}
}

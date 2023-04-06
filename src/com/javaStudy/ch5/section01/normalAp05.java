package com.javaStudy.ch5.section01;

import java.util.Scanner;

public class normalAp05 {

	public static void main(String[] args) {
		
		/* 후라이드, 양념, 파닭, 매콤, 치즈, 간장이라는 메뉴 치킨 메뉴를
		 * 배열에 초기화하고, 사용자가 입력한 값이 배열에 있는지 검색하여
		 * 있으면 "OOO 치킨 배달 가능", 없으면 "OOO 치킨은 없는 메뉴입니다"
		 * 를 출력하세요
		 * 
		 * ========== 출력 ===========
		 * 치킨 이름을 입력하세요 : 양념
		 * 양념치킨 배달 가능
		 * 
		 * 치킨 이름을 입력하세요 : 달콤
		 * 달콤치킨은 없는 메뉴입니다.
		 * */
		
		String[] menu = {"후라이드", "양념", "파닭", "매콤", "치즈", "간장"};
		System.out.println(menu[0]);
		Scanner sc = new Scanner(System.in);
		System.out.print("치킨 검색: ");
		String str = sc.nextLine();
		
	
		System.out.println("입력한 치킨: " + str);
	 
		
		Boolean isTrue = false;
				
		for(int i = 0; i < menu.length; i++) {
							
			if(menu[i].equals(str)) {
				isTrue = true;
			}
		}
		if(isTrue == true) {
		 System.out.println(str + " 치킨 배달 가능");
		}else
		 System.out.println(str + " 치킨은 없는 메뉴입니다.");
		
		
		System.out.println("=============");
		
		Scanner bc = new Scanner(System.in);
		System.out.print("치킨 검색: ");
		String str1 = sc.nextLine();
		
		int num = 0;
		
		for(int i = 0; i < menu.length; i++) {
			if(menu[i].equals(str1)){
				 num++;
			}
		}
		if(num == 1) {
			System.out.println(str + " 치킨 배달 가능");
		}else
			System.out.println(str + " 치킨은 없는 메뉴입니다.");
	
	}
}

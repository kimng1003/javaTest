package com.javaStudy.ch9.hw1;

import java.util.Scanner;

public class LibraryMenu {

	private LibraryManager lm;
	Scanner sc = new Scanner(System.in);
	
	{
		lm = new LibraryManager();
	}
	
	public void mainMenu() {
		

			System.out.println("이름 : ");
			String name = sc.nextLine();
			System.out.println("나이 : ");
			int age = sc.nextInt();
			System.out.println("성별 : ");
			char gender = sc.next().charAt(0);
			lm.insertMember(new Member(name, age, gender));
			
			int menu = 0;
			do {
				System.out.println("==== 메뉴 ====");
				System.out.println("1. 마이페이지");
				System.out.println("2. 도서 전체 조회");
				System.out.println("3. 도서 검색");
				System.out.println("4. 도서 대여하기");
				System.out.println("0. 프로그햄 종료");
				
				
				switch(menu) {
				
					case 1 : lm.myInfo(); break;
					case 2 : lm.selectAll(); break;
					case 3 : lm.searchBook(null); break;
					case 4 : lm.rentBook(0); break;
					case 0 : System.out.println("프로그램 종료");
					default : System.out.println("재입력");
				}
			}while(menu != 0);
			
		
	}
	
	
	
	
	public void selectAll() {
		Book[] bList = lm.selectAll();
		
		for(int i = 0; i < bList.length; i++) {
			
		}
	}
	
	public void searchBook() {
		
	}
	
	public void rentBook() {
		
	}
	
}
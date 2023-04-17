package com.javaStudy.ch9.hw1;

import java.util.Scanner;

public class LibraryMenu {

	private LibraryManager lm;
	Scanner sc = new Scanner(System.in);
	
	{
		lm = new LibraryManager();
	}
	
	public void mainMenu() {
		

		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("성별 : ");
		char gender = sc.next().charAt(0);
		lm.insertMember(new Member(name, age, gender));
		
		int num = 0;
		do {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("0. 프로그램 종료");
			System.out.print("입력 : ");
			num = sc.nextInt();
			
			switch(num) {
			
				case 1 : System.out.println(lm.myInfo()); break;
				case 2 : selectAll(); break;
				case 3 : searchBook(); break;
				case 4 : rentBook(); break;
				case 0 : System.out.println("프로그램 종료"); break;
				default : System.out.println("재입력"); break;
			} 
		}while(num != 0);
		
	}
	
	public void selectAll() {
		Book[] bList = lm.selectAll();
		
		for(int i = 0; i < bList.length; i++) {
		 System.out.println(bList[i]);
		}
	}
	
	public void searchBook() {
		sc.nextLine();
		System.out.println("검색 : ");
		String input = sc.nextLine();
		Book[] bList = lm.searchBook(input);
		
		for(Book a : bList) {
			
			System.out.println(a);
		}
	}
	
	public void rentBook() {
		new LibraryManager().selectAll();
		
		System.out.println("대여할 도서 번호 : ");
		int index = sc.nextInt();
		int result = lm.rentBook(index);
		switch(result) {
			case 0 : System.out.println("대여 성공"); break;
			case 1 : System.out.println("대여 불가. 나이제한"); break;
			case 2 : System.out.println("대여 성공. 요리학원 쿠폰 발급됨. 마이페이지에서 확인"); break;
			default:
		}
		
	}
	
}
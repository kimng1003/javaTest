package com.javaStudy.ch6.level02;

public class Application01 {

	public final static void main(String[] args) {
		
		BookDTO book = new BookDTO();
		
	
		book.printInformation();
	
		BookDTO book2 = new BookDTO("자바의 정석", "도우출판", "남궁성");
		
		book2.printInformation();
		
		BookDTO book3 = new BookDTO("홍길동전", "활빈당", "허균", 5000000, 0.5);
		
		book3.printInformation();
		
		
	}
}

package com.javaStudy.ch9.hw1;

public class LibraryManager {

	private Member mem = null;
	
	private Book[] bList = new Book[5];
	
	{
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
		bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
		
	}
	
	public LibraryManager() {
		super();
	}
	

	public LibraryManager(Member mem, Book[] bList) {
		super();
		this.mem = mem;
		this.bList = bList;
	}

	public Member getMem() {
		return mem;
	}


	public void setMem(Member mem) {
		this.mem = mem;
	}


	public Book[] getbList() {
		return bList;
	}


	public void setbList(Book[] bList) {
		this.bList = bList;
	}


	
	public void insertMember(Member mem) {
		
		this.mem = mem;
	}
	
	public Member myInfo() {
		return mem;
	}
	
	public Book[] selectAll() {
		return bList;
		
	}
	
	public Book[] searchBook(String keyword) {
		
		Book[] input = new Book[5];
		
		int count = 0;
		for(int i = 0; i < bList.length; i++) {
			if(bList[i].getTitle().contains(keyword)) {
				input[count] = bList[i];
				count++;
			}
		
		}
		return input;
	}
	
	public int rentBook(int index) {
		int result = 0;
		
		// 만화책 참조하고, 제한나이>회원나이 인 경우
		if(bList[index] instanceof AniBook) {
			if(mem.getAge() < ((AniBook) bList[index]).getAccessAge())
			result = 1;
		}
		
		// 요리책 참조, 쿠폰 유인 경우
		if(bList[index] instanceof CookBook) {
			if(((CookBook) bList[index]).isCoupon()) {
			mem.setCouponCount(mem.getCouponCount() + 1);
			result = 2;
			}
		}
		
		return result;
		
		
		
	}
	
	
}
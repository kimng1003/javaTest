package com.javaStudy.ch9.hw1;


public class AniBook extends Book {

	private int accessAge;

	public AniBook() {
	}

	
	public AniBook(int accessAge) {
		super();
		this.accessAge = accessAge;
	}


	public AniBook(String title, String author, String publisher, int accessAge) {
		super(title, author, publisher);
		this.accessAge = accessAge;
	}


	public int getAccessAge() {
		return accessAge;
	}


	public void setAccessAge(int accessAge) {
		this.accessAge = accessAge;
	}


	@Override
	public String toString() {
		return super.toString() + "AniBook [accessAge=" + accessAge + "]";
	}
	
	
	
	
}
package com.javaStudy.ch7.hw3;

public class ProductDTO {

	private int pId;		// 제품번호
	private String pName;	// 제품명
	private int price;		// 제품 가격
	private double tax;		// 제품 세금
	
	public ProductDTO() {
		super();
	}

	public ProductDTO(int pId, String pName, int price, double tax) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.price = price;
		this.tax = tax;
		
		ProductController.count++;
	
	}

	public String information() {
		return "제품번호 = " + pId
			+ ", 제품명 = " + pName
			+ ", 제품가격 = " + price
			+ ", 세금 = " + tax;
	}


}

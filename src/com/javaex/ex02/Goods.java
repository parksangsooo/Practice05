package com.javaex.ex02;

public class Goods {
	
	private String name;
	private int price;
	
	public Goods() { // 기본 생성자
	}
	
	// 오버로드 된 전체 필드 생성자
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void showInfo() {
		System.out.println("상품명:" + name + ", 가격: " + price);
	}
}





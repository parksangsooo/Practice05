package com.javaex.ex01;

public class Member {
	
	private String name;
	private String id;
	private int point;
	
//	public Member(String name, String id, int point) {
//		this.name = name;
//		this.id = id;
//		this.point = point;
//	}
	
	public String getName() {
		return name;
	}
	
	public void setNameIdPoint(String name, String id, int point) {
		this.name = name;
		this.id = id;
		this.point = point;
	}
	
	public String getId() {
		return id;
	}

	
	public int getPoint() {
		return point;
	}
	
	public void setPoint(int point) {
		this.point = point;
	}
	
	public void showInfo() {
		System.out.printf("회원정보: %s(%s), %d점\n", name, id, point);
	}


}

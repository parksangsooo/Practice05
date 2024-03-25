package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {
		
		Member Jeong = new Member();
		Jeong.setNameIdPoint("정우성", "jws",50000);
//		Jeong.setPoint(50000);
		
		Member Yoo = new Member();
		Yoo.setNameIdPoint("유재석", "yjs",30000);
//		Yoo.setPoint(30000);
		
		Member Lee = new Member();
		Lee.setNameIdPoint("이효리","lhr",40000);
//		Lee.setPoint(40000);
		
		
		Jeong.showInfo();
		Yoo.showInfo();
		Lee.showInfo();
		
		
	}

}

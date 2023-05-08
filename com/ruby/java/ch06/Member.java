package com.ruby.java.ch06;

public class Member {
	private String name;
	private int age;
	
	public Member(){
		//this.name = "guest";
		//age = 0;
		this(null);//생성자 함수 호출
	}
	public Member(String name) {
		//this.name = name;
		//age=0;
		this(name,0);//생성자 함수 호출
	}
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return name + ":" +age;
	}
	
	public static void main(String[] args) { // main함수는 코드의 시작점, static을 선언하지 않으면 인스턴스를 생성해야 함으로 번거러움이 생김
		Member m1 = new Member();
		Member m2 = new Member("Amy");
		Member m3 = new Member("Amy",23);
		
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(m3.toString());
	}
}

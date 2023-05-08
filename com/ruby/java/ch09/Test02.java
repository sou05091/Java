package com.ruby.java.ch09;

public class Test02 {
	public static void main(String[] args) {
		String s1 = new String("java");
		String s2 = "java";

		String s3 = new String("java");
		String s4 = "java";
		
		System.out.println(System.identityHashCode(s1) + "::" + System.identityHashCode(s2));
		//System.out.println(s1.toString() + "::" + s2.toString());

		if (s1 == s3) {
			System.out.println("동일 객체");
		} else {
			System.out.println("다른 객체");
		}
		if (s2 == s4) {
			System.out.println("동일 객체");
		} else {
			System.out.println("다른 객체");
		}
		if(s1.equals(s3)) { //인자로 전달된 객체와 현제객체가 같은지를 판단 -> 해쉬코드값 비교
			System.out.println("동일 객체");
		} else {
			System.out.println("다른 객체");
		}
		if(s1.equals(s2)) { //인자로 전달된 객체와 현제객체가 같은지를 판단 -> 해쉬코드값 비교
			System.out.println("동일 객체");
		} else {
			System.out.println("다른 객체");
		}
	}
}

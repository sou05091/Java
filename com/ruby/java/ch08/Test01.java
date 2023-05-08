package com.ruby.java.ch08;

public class Test01 {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		Object obj3 = new Object();
		//MyObject obj4 = new MyObject();
		Class c = obj1.getClass();
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
		System.out.println(c.getName());
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		System.out.println(obj3.toString());
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
	}

}

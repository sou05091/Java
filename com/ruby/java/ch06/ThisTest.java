package com.ruby.java.ch06;

public class ThisTest {
	private String name;
public void setName(String name) {
	this.name = name;
	//name = name;
}
public String getName() {
	return name;
}
public static void main(String[] args) {
	ThisTest exam = new ThisTest();
	exam.setName("Amy");
	System.out.println(exam.getName());
	}
}

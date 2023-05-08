package com.ruby.java.ch08.innerClass;

class LinkdList {
	class Node {
		String data;
		Node link;

		public String toString() {
			return "data = " + data;
		}

		Node(String data) {
			this.data = data;
			link = null;

		}
	}
	Node head;
	Node temp = new Node(name);

	void show() {
		Node p = head;
		while (p != null) {
			System.out.println(p.toString());
			p = p.link;
		}

	}

	void add(String name) {
		if (head == null) {
			head = temp;
		} else {
			temp.link = head;
			head = temp;
		}
	}
}

public class 리스트외부클레스 {
	public static void main(String[] args) {
		LinkdList my = new LinkdList();
		my.add("hong");
		my.add("kim");
	}
}

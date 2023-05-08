package chapter3;

import java.util.Scanner;

public class Test22_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
		int a = 0;
		int b = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("OP[+,-,*,/]");
		char op = sc.next().charAt(0);
		
		if (op=='+'||op=='-'||op=='*'||op=='/') {
		System.out.println("첫째");
		a = sc.nextInt();
		
		System.out.println("둘째");
		b = sc.nextInt();
		}
		switch(op) {
		case '+':
		System.out.println(a+b);
		break;
		case '-':
		System.out.println(a-b);
		break;
		case '*':
		System.out.println(a*b);
		break;
		case '/':
		System.out.println(a/b);
		break;
		default:
			System.out.println("잘못된 연산자");
			return;
		}
		}
	}
}

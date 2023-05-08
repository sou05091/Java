package chapter3;

import java.util.Scanner;

public class Test20_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//alt + shift + o 사용함수 불러오기
		while(true) {
		System.out.println("성적을 입력하세요");
		int score = sc.nextInt();
		char grade;
		
		/*if(score>100) {
			System.out.println("점수 초과");
			break;
		}
		
		if(score<=(~score)) {
			System.out.println("잘못된 점수");
			break;
		}*/
		if (score < 0 || 100 < score) {
			break;
		}
		
		if(score >= 90) {
			grade = 'A';
		} else if(score >=80) {
			grade = 'B';
		} else if(score >=70) {
			grade = 'C';
		} else if(score >=60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println(grade);
	}
		System.out.println("프로그램 종료");
	}
}
	
	

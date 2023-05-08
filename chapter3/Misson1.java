package chapter3;

import java.util.Scanner;

public class Misson1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int kor = 0;
			int eng = 0;
			int mat = 0;
			System.out.println("국어점수");
			kor = sc.nextInt();
			if (kor<0||kor>100) break;
			System.out.println("영어점수");
			eng = sc.nextInt();
			if (eng<0||eng>100) break;
			System.out.println("수학점수");
			mat = sc.nextInt();
			if (mat<0||mat>100) break;
			int avg = ((kor+eng+mat)/3);
				if(avg>70 && kor>60 && eng>60 && mat>60) {
					System.out.println("합격 " + String.format("%.2f", avg));//소수점 2자리까지 표현
				}else if(avg>70 && kor<60||eng<60||mat<60){
					System.out.println("과락 " + avg);
					break;
				}else{
					System.out.println("탈락 " + avg);
					break;
			} 
		}
	}
}

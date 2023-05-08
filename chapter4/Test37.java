package chapter4;

public class Test37 {
	public static void main(String[]args) {

		int[] score = {90,85,78,100,98};
		double avg = 0;
		int sum = 0;
		int min = 999;
		int max = 0;
		
		for(int i = 0; i<score.length; i++) {
			sum += score[i];
			if(max<score[i])
				max = score[i];
			if(min>score[i])
				min = score[i];
		}
		
		avg = (double)sum / score.length; //소수점을 나타내기 위해 int -> double로 변경
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + String.format("%.2f", avg));
		System.out.println("최댓값 : " + max);
		System.out.println("최솟값 : " + min);
	}
	
	
}
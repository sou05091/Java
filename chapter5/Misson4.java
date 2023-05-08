package chapter5;

public class Misson4 {

	public static void main(String[] args) {
		int idx=0;
		int[] arr = new int [40];
		int year = 2023;
		for(int i = year; ; i++) {
			if((i%4)==0 && (i%100)!=0) {
				arr[idx++] = i;
			} else if((i%4)==0 && (i%400)==0) {
				arr[idx++] = i;
			} else if(idx >= 40) {
				break;
			}
		}
		for(int i=0; i<40; i++) {
			System.out.println(arr[i]);
		}
	}
}
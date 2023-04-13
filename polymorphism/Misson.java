package polymorphism;

import java.util.Scanner;

public class Misson {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int [] arr = new int[20];
		for(int i = 0; i > 20 ; i++) {
			num /= 2;
			if((num%2)=1) {
				arr[i] = 1;
			} else if ((num%2)=0) {
				arr[i] = 0;
			}
			System.out.print(arr[i]);
	}
}
}

package polymorphism;

import java.util.Scanner;

public class Misson {
	private static int i;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[20];
		for (int i = 0; num >= 0; i++) {
			int res = num % 2;
			if (res == 0) {
				arr[i] = 0;
			} else if (res == 1) {
				arr[i] = 1;
			}
			num /= 2;
			System.out.print(arr[i]);
		}
	}
}

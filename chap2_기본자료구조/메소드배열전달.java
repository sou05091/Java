package chap2_기본자료구조;

import java.util.Random;

public class 메소드배열전달 {
	static void getData(int[] num) {
		// 난수 생성하여 배열에 입력
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			num[i] = rand.nextInt(10);
		}

	}

	static void showData(int[] pri) {
		// 난수 생성하여 출력
		for (int i = 0; i < 10; i++) {
			System.out.print(pri[i] + ", ");
		}
	}

	static int findMax(int[] data) {
		int max = 0;
		for (int i = 0; i < 10; i++) {
			if (data[0] < data[i]) {
				max = data[i];
			}
		}
		return max;
	}

	static void swap(int[] d, int i, int j) {
		int temp = d[i];
		d[i] = d[j];
		d[j] = temp;
	}

	static void sortData(int[] data) {
		for (int i = 0; i < data.length; i++) {
			for (int j = i + 1; j < data.length; j++) {
				if (data[i] >= data[j]) {
					swap(data, i, j);
				}
			}
			System.out.print(data[i]);
		}
	}
	static void getDataArr(int[][] num) {
		// 난수 생성하여 배열에 입력
		Random rand = new Random();
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				num[i][j] = rand.nextInt(10);				
			}
		}
	}
	
	static void showDataArr(int [][] num){
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[0].length; j++) {
				System.out.print(num[i][j]+"  ");
			}
			System.out.print("\n");
		}
		System.out.println();
	}
	
	static void addMatrix(int [][] arr1, int [][] arr2, int[][] arr3) {
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[0].length; j++) {
				System.out.print(arr1[i][j]+"  ");
			}
			System.out.print("\n");
		}
		System.out.println();
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[0].length; j++) {
				System.out.print(arr2[i][j]+"  ");
			}
			System.out.print("\n");
		}
		System.out.println();
		
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[0].length; j++) {
				arr3[i][j] = arr1[i][j] + arr2[i][j];
				System.out.print(arr3[i][j]+"  ");
			}
			System.out.print("\n");
		}
		System.out.println();
	}
	
	static void multiMatrix(int [][] arr1, int [][] arr2, int[][] arr3) {
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[0].length; j++) {
				System.out.print(arr1[i][j]+"  ");
			}
			System.out.print("\n");
		}
		System.out.println();
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[0].length; j++) {
				System.out.print(arr2[i][j]+"  ");
			}
			System.out.print("\n");
		}
		System.out.println();
		
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[0].length; j++) {
				for (int k = 0; k < arr2.length; k++) {
					arr3[i][j] += (arr1[i][k] * arr2[k][j]);
				}
				System.out.print(arr3[i][j]+"  ");	
			}
			System.out.print("\n");
		}
		System.out.println();
	}

	public static void main(String[] args) {
//		int[] data = new int[10];
//		getData(data);
//		showData(data);
//		int mvalue = findMax(data);
//		System.out.println("\nmax = " + mvalue);
//		sortData(data);
		int [][] arr = new int[3][3];
		int [][] arr1 = new int [3][3];
		int [][] arr2 = new int [3][3];
		int [][] arr3 = new int [3][3];
		getDataArr(arr);
		getDataArr(arr1);
		getDataArr(arr2);
		//showDataArr(arr);
		multiMatrix(arr1, arr2, arr3);
		
	}
}

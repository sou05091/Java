package chap3_검색알고리즘;

import java.util.Arrays;
import java.util.Random;


public class 정수배열이진탐색_Test {
	public static void main(String[] args) {

		
		int []data = new int[10];
		inputData(data);
		showData(data);
		sortData(data);
		System.out.println();
		for (int num: data) {
			System.out.print(num+" ");
		}
		int key = 33;
		int result = linearSearch(data, key);
		System.out.println("\nlinearSearch(): result = " + result);
		
		key = 39;
		result = binarySearch(data, key);
		System.out.println("\nbinarySearch(): result = " + result);
		int idx = Arrays.binarySearch(data, key);
		System.out.println("\nArrays.binarySearch(): result = " + result);
		
	}
	
	private static int linearSearch(int[] data, int key) {
		// TODO Auto-generated method stub
		for(int i = 0 ; i<data.length; i++) {
			if (key == data[i])
				return i;
		}
		return -1;
	}

	private static int binarySearch(int[] data, int key) {
		int n = data.length;
		// TODO Auto-generated method stub
		int pl = 0; // 검색 범위 첫 인덱스
		int pr = n-1; // 검색 범위 끝 인덱스
		do {
			int pc = (pl+pr) / 2; //중앙 요소의 인덱스
			if(data[pc] == key)
				return pc; // 검색성공
			else if (data[pc] < key)
				pl = pc + 1; // 검색 범위를 뒤쪽으로 절반 좁힘
			else
				pr = pc - 1; // 검색 범위를 앞쪽으로 절반 좁힘
		} while (pl <= pr);
		return -1; // 검색 실패
	}

	static void swap(int[] d, int i, int j) {
		int temp = d[i];
		d[i] = d[j];
		d[j] = temp;
	}
	
	private static void sortData(int[] data) {
		// TODO Auto-generated method stub
		for(int i = 0; i<data.length; i++) {
			for(int j = i+1; j<data.length; j++) {
				if(data[i] >= data[j]) {
					swap(data, i, j);
				}
			}
		}
	}

	private static void showData(int[] data) {
		// TODO Auto-generated method stub
		for (int i = 0; i<10; i++) {
			System.out.println(data[i]);	
		}
	}

	private static void inputData(int[] data) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		for(int i = 0; i<10 ; i++) {
			data[i] = rand.nextInt(40);
		}
	}
}

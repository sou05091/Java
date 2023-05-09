package chap3_검색알고리즘;

import java.util.Arrays;
import java.util.Random;

public class 스트링배열이진탐색_Test {
	public static void main(String[] args) {
		String []data = {"apple","grape","persimmon", "감", "배", "사과", "포도", "pear","blueberry", "strawberry", "melon", "oriental melon"};

		//showData(data);
		sortData(data);
		showData(data);
		
		String key = "감";
		int result = linearSearch(data, key);
		System.out.println("\nlinearSearch(): result = " + result);
		
		key = "배";
		result = binarySearch(data, key);
		System.out.println("\nbinarySearch(): result = " + result);
		int idx = Arrays.binarySearch(data, key);
		System.out.println("\nArrays.binarySearch(): result = " + result);
		
	}

	private static int binarySearch(String[] data, String key) {
		// TODO Auto-generated method stub
		int n = data.length;
		int pl = 0;
		int pr = n-1;
		do {
			int pc = (pl+pr) / 2; //중앙 요소의 인덱스
			if(data[pc] == key)
				return pc; // 검색성공
			else if (data[pc].compareTo(key) < 0)
				pl = pc + 1; // 검색 범위를 뒤쪽으로 절반 좁힘
			else
				pr = pc - 1; // 검색 범위를 앞쪽으로 절반 좁힘
		} while (pl <= pr);
		return -1;
	}

	private static int linearSearch(String[] data, String key) {
		// TODO Auto-generated method stub
		for(int i = 0; i<data.length; i++) {
			if(data[i].compareTo(key) == 0)
				return i;
		}
		return 0;
	}
	
	static void swap(String[]d, int i,int j){
		String temp = d[i];
		d[i] = d[j];
		d[j] = temp;
	}
	
	private static void sortData(String[] data) {
		// TODO Auto-generated method stub
//		Arrays.sort(data);
		for (int i = 0; i<data.length; i++) {
			for (int j = i+1; j<data.length; j++)
			if (data[i].compareTo(data[j]) > 0) {
				swap(data,i,j);
			}
		}
//		int result1 = str1.compareTo(str2);
//        System.out.println(result1);
	}

	private static void showData(String[] data) {
		// TODO Auto-generated method stub
		for(int i=0; i<data.length; i++) {
		System.out.print(data[i] + ", ");
		}
	}
}

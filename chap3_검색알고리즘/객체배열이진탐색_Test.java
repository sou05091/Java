package chap3_검색알고리즘;

import java.util.Arrays;

//5번 실습 - 2장 실습 2-14를 수정하여 객체 배열의 정렬 구현
class PhyscData1 implements Comparable<PhyscData1>{
	private String name;
	private int height;
	private double vision;
	
	public PhyscData1(String name, int height, double vision) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.height = height;
		this.vision = vision;
	}
	
	@Override
	public int compareTo(PhyscData1 pd) {
		if(this.name.compareTo(pd.name) == 0)
			return Integer.compare(this.height, pd.height);
		if (this.height == pd.height)
			return Double.compare(this.vision, pd.vision);
		if(this.vision == pd.vision)
			return 0;
		else
			return this.name.compareTo(pd.name);
	}
	
	public String getName() {
		return name;
	}
	public int getHeight() {
		return height;
	}
	public double getVision() {
		return vision;
	}
//	public static void int binarySearch(int[] data, int key) {
//		
//	}
	
}
	
public class 객체배열이진탐색_Test {
	
	public static void main(String[] args) {
		PhyscData1[] data = {
				new PhyscData1("홍길동", 162, 0.3),
				new PhyscData1("홍동", 164, 1.3),
				new PhyscData1("홍길", 152, 0.7),
				new PhyscData1("김홍길동", 172, 0.3),
				new PhyscData1("길동", 182, 0.6),
				new PhyscData1("길동", 167, 0.2),
				new PhyscData1("길동", 167, 0.5),
		};
		//showData(data);
		sortData(data);
		showData(data);
		
		PhyscData1 key = new PhyscData1("길동", 167, 0.2);
		int result = linearSearch(data, key);
		System.out.println("\nlinearSearch(): result = " + result);
		
		key = new PhyscData1("길동", 167, 0.5);
		result = binarySearch(data, key);
		System.out.println("\nbinarySearch(): result = " + result);
		int idx = Arrays.binarySearch(data, key);
		System.out.println("\nArrays.binarySearch(): result = " + result);
	}
	
	private static int binarySearch(PhyscData1[] data, PhyscData1 key) {
		// TODO Auto-generated method stub
		int n = data.length;
		int pl = 0;
		int pr = n-1;
		do {
			int pc = (pl+pr) / 2;
			if(data[pc].getName().compareTo(key.getName()) == 0 && data[pc].getHeight() == key.getHeight() && data[pc].getVision() == key.getVision())
			return pc;
			else if (data[pc].getName().compareTo(key.getName()) < 0)
				pl = pc + 1;
			else if (data[pc].getName().compareTo(key.getName()) == 0 && data[pc].getHeight() != key.getHeight())
				pl = pc + 1;
			else if (data[pc].getName().compareTo(key.getName()) == 0 && data[pc].getHeight() == key.getHeight() && data[pc].getVision() != key.getVision())
				pl = pc + 1;
			else
				pr = pc - 1;
		} while (pl <= pr);
		return -1;
	}

	private static int linearSearch(PhyscData1[] data, PhyscData1 key) {
		// TODO Auto-generated method stub
		for(int i = 0; i<data.length; i++) {
			if(data[i].getName().compareTo(key.getName()) == 0)
				if(data[i].getHeight() == key.getHeight())
					if(data[i].getVision() == key.getVision())
				return i;
		}
		return 0;
	}

	private static void sortData(PhyscData1[] data) {
		// TODO Auto-generated method stub
		Arrays.sort(data);
	}

	static void showData(PhyscData1[] data) {
//		System.out.println();
//		for (PhyscData1 fruit: arr) {
//			System.out.print(fruit+" ");
//		}
//		System.out.println();
		for(int i=0; i < data.length; i++) {
		System.out.println(data[i].getName() + "  " + data[i].getHeight() +"  "+ data[i].getVision());
		}
	}
	
}

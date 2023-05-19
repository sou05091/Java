package chap3_검색알고리즘;

import java.util.Arrays;
import java.util.Comparator;

//3장 객체 배열 정렬 - binary search
/*
* Comparator를 사용하는 방법
* MyComparator implements Comparator<>
* MyComparator myComparator = new MyComparator();
* Arrays.sort(array, myComparator);
* Collections.sort(list, myComparator);
*/
class Fruit{
	String name;
	int price;
	String expire;
	public Fruit(String name, int price, String expire) {
		this.name = name;
		this.price = price;
		this.expire = expire;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public String getExpire(){
		return expire;
	}
	
	
	public static final Comparator<Fruit> Class_cc = new ComparatorFruit();
	
	private static class ComparatorFruit implements Comparator<Fruit>{
		public int compare(Fruit f1, Fruit f2) {
			return (f1.expire.compareTo(f2.expire));
		}
	}
}


public class Fruit객체배열이진탐색_Test {
	
	public static void main(String[] args) {
		Fruit[] arr = { new Fruit("사과", 200, "2023-5-8"), 
						new Fruit("키위", 500, "2023-6-8"),
						new Fruit("오렌지", 200, "2023-7-8"), 
						new Fruit("바나나", 50, "2023-5-18"), 
						new Fruit("수박", 880, "2023-5-28"),
						new Fruit("체리", 10, "2023-9-8") };
		System.out.println("정렬전 객체 배열: ");
		showData(arr);
		
		Arrays.sort(arr, (a, b) -> a.getPrice() - b.getPrice()); // Fruit에 compareTo()가 있어도 람다식 우선 적용
		System.out.println("\n람다식 정렬(가격)후 객체 배열: ");
		showData(arr);

		Arrays.sort(arr, new Comparator<Fruit>() {
			@Override
			public int compare(Fruit a1, Fruit a2) {
				return a1.getName().compareTo(a2.getName());
			}
		});
		System.out.println("\ncomparator 정렬(이름)후 객체 배열: ");
		showData(arr);
		
		Arrays.sort(arr, new Comparator<Fruit>() {
			@Override
			public int compare(Fruit a1, Fruit a2) {
				return a1.getExpire().compareTo(a2.getExpire());
			}
		});
		System.out.println("\nExpire 정렬(이름)후 객체 배열: ");
		showData(arr);

		
		Comparator<Fruit> cc_expire = new Comparator<Fruit>() {// 익명클래스 사용
			public int compare(Fruit f1, Fruit f2) {
				return (f1.expire.compareTo(f2.expire));
			}
		};

		Comparator<Fruit> cc_name = new Comparator<Fruit>() {// 익명클래스 사용
			public int compare(Fruit f1, Fruit f2) {
				return (f1.name.compareTo(f2.name));
			}
		};
		
		Comparator<Fruit> cc_price = new Comparator<Fruit>() {// 익명클래스 사용
			public int compare(Fruit f1, Fruit f2) {
				return (f1.price - f2.price);
			}
		};

		Fruit newFruit = new Fruit("체리", 500, "2023-5-18");
		
		int result3 = Arrays.binarySearch(arr, newFruit, cc_name);
		System.out.println("\nArrays.binarySearch() 조회결과::" + result3);
		
		result3 = binarySearch(arr, newFruit, cc_name);
		System.out.println("\nbinarySearch() 조회결과::" + result3);
		sortData(arr, cc_price);
		
		System.out.println("\ncomparator 정렬(가격)후 객체 배열: ");
		showData(arr);
		
		result3 = Arrays.binarySearch(arr, newFruit, cc_price);
		System.out.println("\nArrays.binarySearch() 조회결과::" + result3);
		
		result3 = binarySearch(arr, newFruit, cc_price);
		System.out.println("\nbinarySearch() 조회결과::" + result3);
	}
	
	private static int binarySearch(Fruit[] arr, Fruit newFruit, Comparator<? super Fruit> cc) {
		// TODO Auto-generated method stub
//		Arrays.binarySearch(arr, newFruit, cc_price);
		int n = arr.length;
		int pl = 0;
		int pr = n-1;
		do {
			int pc = (pl+pr) /2;
			if(arr[pc].getPrice() == newFruit.getPrice())
				return pc;
			else if (arr[pc].getName().compareTo(newFruit.getName()) == 0)
				return pc;
			else  if (arr[pc].getPrice() < newFruit.getPrice())
				pl = pc + 1;
			else if (arr[pc].getName().compareTo(newFruit.getName()) != 0)
				pl = pc + 1;
			else
				pr = pc- 1;
		} while (pl <= pr );
		return -1;
	}

	private static void showData(Fruit[] arr) {
		// TODO Auto-generated method stub
		for (int i =0; i < arr.length; i++) {
			System.out.println(arr[i].getName() + arr[i].getPrice() + arr[i].getExpire());
		}
	}

	private static void sortData(Fruit[] arr, Comparator<Fruit> cc_price) {
		// TODO Auto-generated method stub
		Arrays.sort(arr, (a, b) -> a.getPrice() - b.getPrice());
	}
}

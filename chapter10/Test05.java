package chapter10;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Test05 {
	public static void print(int n, List<String> list) {
		System.out.println(n+ " : " + list.toString());
	}
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();

		list.add("서울");
		list.add("북경");
		list.add("상해");
		list.add(0, "LA");
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i) + "\t");
//		}
		for(String sx : list) {
		}
		print(1, list);
		
		List<String> list2 = Arrays.asList("LA", "뉴욕");
		list.addAll(list2);
		print(2, list);
		
		Object obj[] = list.toArray();
		System.out.println("배열 풀력 : " + Arrays.toString(obj));
	}
}

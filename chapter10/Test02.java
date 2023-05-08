package chapter10;

import java.util.ArrayList;
import java.util.Iterator;

public class Test02 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("서울");
		list.add("북경");
		list.add("상해");
		list.add("엘에이");
		list.add("도쿄");
		list.add("뉴욕");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("====================");
		
		String [] sl = new String[10];
		//sl[0]에 대구를 입력하는법
		sl[0] = "서울";
		sl[1] = "부산";
		sl[0] = sl[1];
		sl[1] = sl[2];
		sl[0] = "대구";
		//hard-coding 안좋은 방법
		for(String sx: sl) {
			System.out.println(" " + sx);
		}
		list.add(0, "대구");
		System.out.println("====================");
		
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}

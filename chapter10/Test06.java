package chapter10;

import java.util.HashMap;

public class Test06 {
	public static void main(String[] args) {
		String word[] = { "BUMBLEBEE", "HEAVEN", "ALTHOUGH", "WONDER" };
		String meaning[] = { "꿀벌과에 속하는 호박벌", "천국", "그럼에도 불구하고", "호기심이 들다" };

		HashMap<String, String> dic = new HashMap<String, String>();
		for (int i = 0; i < word.length; i++) {
			dic.put(word[i], meaning[i]);
		}
		System.out.println(dic.toString());
		System.out.println(dic.size());

		System.out.println(dic.keySet());
		System.out.println(dic.values());

		System.out.println("Heaven : " + dic.get("Heaven"));
		dic.replace("Heaven", "아주 행복한 감정");
		System.out.println("Heaven : " + dic.get("Heaven"));
		dic.put("Heaven", "이상적인 세상");
		//hashmap은 key에 의해서 저장공간 결정
		//treemap은 key에 조건식을 달아 저장공간에 저장 /정렬이 자동으로 이루어짐
	}
}

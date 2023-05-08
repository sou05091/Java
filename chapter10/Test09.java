package chapter10;

import java.util.Map;
import java.util.TreeMap;

public class Test09 {
public static void main(String[] args) {
	TreeMap<String, String> users = new TreeMap<String, String>();
	
	users.put("20080319", "김푸름");
	users.put("20070620", "김하늘");
	users.put("20050817", "오정임");
	users.put("20120728", "김유빈");
	users.put("20120924", "김용빈");
	System.out.println(users);
	Map.Entry<String, String> entry = null;
	entry = users.firstEntry();
//	print("입사가 가장빠른 사람", entry);
//	
//	Map.entry("입사가 가장 늦은 사람", entry);
//	Map.Entry<"2012년도애 가장 늦게 입사한 사함", entry>
	}
}

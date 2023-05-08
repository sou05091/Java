package chapter15;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Test01 {
public static void main(String[] args) {
	ArrayList<Integer> myList = new ArrayList<>();
	myList.add(50);
	myList.add(10);
	myList.add(80);
	
	System.out.println("점수목록 : ");
	Stream<Integer> myStream = myList.stream();
	myStream.forEach((n) -> System.out.println(n+" "));
	System.out.println();
}
}

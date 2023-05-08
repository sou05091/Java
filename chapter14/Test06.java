package chapter14;

//interface StringFunc{
//	String modify(String s); 
//}
//interface IntegerFunc{
//	Integer modify(Integer s); 
//}
interface MyFunc<T>{
	T modify(T t);
}

public class Test06 {
public static void main(String[] args) {
	//제네릭 = 모든타입 표현가능 정수는 String으로 변환
	MyFunc<String> mf1 = (str) -> str.toUpperCase() + ":" + str.length();
	System.out.println(mf1.modify("Java"));
	System.out.println(mf1.modify("Java Programing"));
}
}

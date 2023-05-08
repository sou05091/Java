package chapter14;

interface Multiply {
	double getValue();
}
interface Verify{
	boolean check(int n);
}
interface Verify2{
	boolean check(int n , int d);
}
// 람다식은 interface안에 함수가 하나여야만 한다.

public class Test02 {
	public static void main(String[] args) {
		Multiply m;
		m = () -> 3.14 * 2;
		System.out.println(m.getValue());

		m = () -> 10 * 3;
		System.out.println(m.getValue());
		
		Verify v = (n)->(n%2)==0;
		System.out.println(v.check(10));
		
		Verify2 v2 = (n,d)->(n%d)==0;
		System.out.println(v2.check(11,2));
	}
}

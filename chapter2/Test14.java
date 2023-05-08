package chapter2;

public class Test14 {

	public static void main(String[] args) {
		char c = 'A';
		int n = c;
		System.out.println(n);
		System.out.println(Integer.toBinaryString(n));
		c ^= (1<<5);//1을 5비트만큼이동후 XOR연산
		int x = c;
		System.out.println(x);
		System.out.println(Integer.toBinaryString(x));
	}

}

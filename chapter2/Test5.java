package chapter2;

public class Test5 {

	public static void main(String[] args) {
		int a = 10;
		System.out.println("a++ = " + a++);//증가하는값 나중에
		System.out.println("++a = " + ++a);//증가하는값 즉시
		a++;
		++a;
		System.out.println("a = " + a);
		
		int b = 10;
		b--;
		System.out.println(b);
		--b;
		System.out.println(b);
		
		int c = 10;
		int d = 10;
		System.out.println(++c);
		System.out.println(d++);

	}

}

package chapter2;

public class Test13 {

	public static void main(String[] args) {
		byte a = 0b1011;
		byte b = 0b0111;
		
		int c = a&b;
		System.out.println("c = "+c);
		System.out.println(Integer.toBinaryString(c));
		int d = a|b;
		System.out.println("d = "+d);
		System.out.println(Integer.toBinaryString(d));
		int e = a^b; //값이 다른것만 true 리턴
		System.out.println("e = "+e);
		System.out.println(Integer.toBinaryString(e));
		
		int f = 12;
		int g = (~f)+1;//정수를 음수로 변환
		System.out.println(g);
		System.out.println(Integer.toBinaryString(g));
		
		int h = f<<1; //왼쪽으로 1비트 이동
		int i = f>>1; //오른쪽으로 1비트 이동
		System.out.println(h);
		System.out.println(i);
		System.out.println(Integer.toBinaryString(f));
		System.out.println(Integer.toBinaryString(h));
		System.out.println(Integer.toBinaryString(i));
	}

}

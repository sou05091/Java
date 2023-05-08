package chapter2;

public class Test3 {

	public static void main(String[] args) {
		byte age;
		//byte = -128~127
		short point;
		//short = -32768~32767
		int price;
		//int = -2147483648~2147483647
		long totalSales;
		
		age=23;
		//변수이름 확실하게 할것,
		point=32000;
		price=3500000;
		totalSales=2147483648L;
		//lieteral : 문자그대로의값
		
		System.out.println(age);
		System.out.println(point);
		System.out.println(price);
		System.out.println("totalSales = " + totalSales);
	}

}

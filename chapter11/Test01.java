package chapter11;

public class Test01 {
	public static void main(String[] args) {
		try {
			int arr[] = new int[3];
			arr[3] = 30;
			String s = new String("java");
			int len = s.length();
			s = null;
			s.length();
			//System.out.println("OK");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("잘못된 배열의 인덱스 사용!" + e.toString());
			//e.printStackTrace(); // 에러발생 원인 표시
		} catch (NullPointerException e2) {
			System.out.println("잘못된 참조");
		}
		System.out.println("Good");
	}
}

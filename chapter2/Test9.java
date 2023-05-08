package chapter2;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 2;
		boolean gender = true;
		System.out.println(a == 10 && gender == false);//false가 나오면 검사종료
		System.out.println(a == 10 & gender == false); //앞 결과와 상관없이 모두 수행함
		if (a == 10 & gender == false) { // !gender = gender == false !=부정
			a++;
			System.out.println(a);
		}
		if (a == 10 || gender == false) { //두개의 값중 하나라도 true가 있을때 true
			a++;
			System.out.println(a);
		}
	}

}

package chapter7;

public class LMSTest {
	public static void main(String[] args) {
		Employee e = new Employee();
		System.out.println(e);
		
		Employee e1 = new Employee ("김민범", 20, "입학처");
		System.out.println(e1);
		
		Professor p = new Professor("김푸름", 52, "빅데이터");
		System.out.println(p);
		
		Student s = new Student("김유빈", 20, "컴퓨터 과학");
		System.out.println(s);
//		Professor p = new Professor();
//		Student s = new Student();
//		
//		e.setName("오징어");
//		e.setAge(47);
//		e.setDept("입학처");
//		
//		p.setName("김푸름");
//		p.setAge(52);
//		p.setSubject("빅데이터");
//		
//		s.setName("김유빈");
//		s.setAge(20);
//		s.setMajor("컴퓨터과학");
//		
//		System.out.println(e.toString());
//		System.out.println(p.toString());
//		System.out.println(s.toString());
		//super.toStrong = 부모에있는 함수를 그대로 호출
		//super(); 부모 생성자 호출
		}
}

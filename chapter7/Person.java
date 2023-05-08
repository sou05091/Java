package chapter7;

public class Person {
	private String name;
	private int age;
	//final class = 변경안됨, 상수안됨, 생성자때 생성되고 끝
//	public static void main(String[] args) {
//		Person m = new Person();
//		m.setName("김민범");
//		m.setAge(20);
//		
//		System.out.println(m);
//	}
	public Person() {
		//System.out.println("생성자 호출");
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}

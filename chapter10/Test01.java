package chapter10;

import java.util.ArrayList;
import java.util.Arrays;

class Employee {
	String name;
	int age;
	int height;
	int weight;
	char bloodType;
	String email;

	public Employee(String name, int age, int height, int weight, char bloodType, String email) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.bloodType = bloodType;
		this.email = email;
	}

	public String toString() {
		return name + ", " + age + ", " + height + ", " + weight + ", " + bloodType + ", " + email;
	}
}

public class Test01 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("서울");
		list.add("북경");
		list.add("상해");
		list.add("서울");
		list.add("도쿄");
		list.add("뉴욕");
		list.add("뉴욕");
		list.remove(3);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		int[] a = new int[10];
		Employee[] eset = new Employee[10];
		eset[0] = new Employee("Kim", 20, 180, 80, 'A', "sou05091@gmail.com");
		eset[1] = new Employee("Lee", 25, 160, 50, 'O', "sou05092@gmail.com");
		eset[2] = new Employee("Cha", 30, 170, 80, 'O', "sou05093@gmail.com");
		eset[3] = new Employee("Jun", 27, 180, 70, 'B', "sou05094@gmail.com");
		for (int i = 0; i < 4; i++) {
			System.out.println(eset[i]);
		}

		Object arr[]= new Object[10];
		String s = "java";
		Integer i = 123;
		arr[0] = s;
		arr[1] = i;
		int len = ((String)arr[0]).length();
		
		Object obj = list.toArray();
		//System.out.println("8:  " + Arrays.toString(obj));

//		ArrayList list1 = new ArrayList();
//		list.add(s);
//		list.add(i);
//		int len2 = ((String)list.get(0)).length();
//		
	}
}

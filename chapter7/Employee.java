package chapter7;

public class Employee extends Person {
	private String dept;
	
	public Employee() {
		//System.out.println("Employee 생성자 호출");
	}
	public Employee(String name, int age, String dept) {
//		setName(name);
//		setAge(age);
		super(name, age);
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [name=" + getName() + ", age=" + getAge() + ", dept=" + dept + "]";
	}

}


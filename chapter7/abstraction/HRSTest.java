package chapter7.abstraction;

abstract class Employee{
	private String name;
	private int salary;

	public Employee(String string, int i) {
		name = string;
		salary = i;
	}
	
	public abstract void calcSalary(); 
	public abstract void calcBonus();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}

class Salesman extends Employee{
	
	public Salesman(String string, int i) {
		super(string, i);
	}

	public void calcSalary() {
		System.out.println(getName() + " 급여 = " + getSalary() +  " + 컨설팅 특별 수당 ");
	}
	public void calcBonus() {
		System.out.println(getName() + " 보너스 = 기본급 * 12 * 2 = " + (getSalary()*12*2));
	}

}

class Consultant extends Employee{
	public Consultant(String string, int i) {
		super(string, i);
	}
	public void calcSalary() {
		System.out.println(getName() + " 급여 = " + getSalary() +  " + 개발 수당 ");
	}
	public void calcBonus() {
		System.out.println(getName() + " 보너스 = 기본급 * 12 * 2 = " + (getSalary()*12*2));
	}
}

abstract class Manager extends Employee{
	public Manager(String string, int i) {
		super(string, i);
	}
	
	public void calcSalary() {
		System.out.println(getName() + " 급여 = " + getSalary() +  " + 팀 성과 수당 ");
	}
}

class Director extends Manager{
	public Director(String string, int i) {
		super(string, i);
	}

	public void calcBonus() {
		System.out.println(getName() + " 보너스 = 기본급 * 12 * 2 = " + (getSalary()*12*2));
	}
}

public class HRSTest {
	public static void main(String[] args) {
		Salesman s = new Salesman("사원", 300);
		Consultant c = new Consultant("부사장", 500);
		Manager m = new Director("이사", 400);
//		s.salary = 300;
//		s.name = "대리";
//		c.salary = 200;
//		c.name = "사원";
//		m.salary = 500;
//		m.name = "이사";
		
		s.calcSalary();
		s.calcBonus();
		c.calcSalary();
		c.calcBonus();
		m.calcSalary();
		m.calcBonus();
		
	}
}

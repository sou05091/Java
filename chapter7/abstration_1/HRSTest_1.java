package chapter7.abstration_1;

abstract class Employee{
	String name;
	int salary;

public abstract void calcSalary(); 
	
}

class Salesman extends Employee{
	public void calcSalary() {
		System.out.println("Salesman 급여 = 기본금 + 판매수당");
	}
}

class Consultant extends Employee{
	public void calcSalary() {
		System.out.println("Consultant 급여 = 기본금 + 컨설팅 특별 수당");
	}
}

class Manager extends Employee{
	public void calcSalary() {
		System.out.println("Manager 급여 = 기본급 + 팀 성과 수당");
	}
}

class Director extends Manager{
}

public class HRSTest_1 {
	public static void main(String[] args) {
		Salesman s = new Salesman();
		Consultant c = new Consultant();
		Manager m = new Manager();
		
		s.calcSalary();
		c.calcSalary();
		m.calcSalary();
	}
}

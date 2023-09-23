package SalaryCalculator_ClassesProject;

public class Employee {
	String name;
	double salary;
	int workHours;
	int hireYear;
	
	Employee(String name, double salary, int workHours, int hireYear){
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	double tax() {
		if(this.salary >= 1000) {
			return this.salary * 0.03;
		}else {
			return 0.0;
		}
	}
	double bonus() {
		if(this.workHours > 40) {
			return (workHours - 40) * 30.0;
		}else {
			return 0.0;
		}
	}
	double raiseSalary() {
		int twy = 2021- this.hireYear;
		if (twy < 10) {
			return this.salary * 0.05;
		}else if (twy < 20) {
			return this.salary * 0.10;
		}else {
			return this.salary * 0.15;
		}
		
	};
	public	String toString() {
		return "Name: " + this.name + 
				"\nSalary: " + this.salary +
				"\nWork Hours(Weekly): " +this.workHours +
				"\nEmpoyment Start Date: " +this.hireYear +
				"\nTax: " + tax() +
				"\nBonus: " + bonus() +
				"\nSalary Increase: " + raiseSalary() +
				"\nSalary with Tax and Bonuses: " + (this.salary + bonus() - tax()) +
				"\nTotal Salary: " + (this.salary + raiseSalary());
	}
}

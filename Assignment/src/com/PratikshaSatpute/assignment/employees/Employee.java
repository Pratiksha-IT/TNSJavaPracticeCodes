package com.PratikshaSatpute.assignment.employees;

public class Employee {

	private String name;
	private int Employeeid;
	private long salary;



	public Employee() {
		super();
	}



	public Employee(int Employeeid,String name, long salary) {
		super();
		this.name = name;
		this.Employeeid = Employeeid;
		this.salary = salary;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getEmployeeid() {
		return Employeeid;
	}



	public void setEmployeeid(int Employeeid) {
		this.Employeeid = Employeeid;
	}



	public long getSalary() {
		return salary;
	}



	public void setSalary(long salary) {
		this.salary = salary;
	}





	@Override
	public String toString() {
		return "Employee [name=" + name + ", Employeeid=" + Employeeid + ", salary=" + salary + "]";
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(102,"Raj", 55000);
		System.out.println(e1);
	}

}
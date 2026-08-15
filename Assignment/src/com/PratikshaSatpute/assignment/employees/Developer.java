package com.PratikshaSatpute.assignment.employees;

public class Developer extends Employee{
	
	private int tasks;
	private String specialization;
	
	

	public Developer() {
		super();
	}



	public Developer(int Employeeid,String name,long salary,int tasks, String specialization) {
		super(Employeeid,name,salary);
		this.tasks = tasks;
		this.specialization = specialization;
	}
	
	
	
	public int getTasks() {
		return tasks;
	}



	public void setTasks(int tasks) {
		this.tasks = tasks;
	}



	public String getSpecialization() {
		return specialization;
	}



	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	
	



	@Override
	public String toString() {
		return "Developer [tasks=" + tasks + ", specialization=" + specialization + ", getName()=" + getName()
				+ ", getEmpid()=" + getEmployeeid() + ", getSalary()=" + getSalary() + "]";
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Developer d1=new Developer(102,"Ira",70000,9,"Software Developer");
		System.out.println(d1);

	}

}

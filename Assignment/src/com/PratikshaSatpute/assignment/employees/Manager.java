package com.PratikshaSatpute.assignment.employees;

public class Manager extends Employee {
	
	private int teamsize;
	private String dept;
	
	

	public Manager() {
		super();
	}
	
	

	public Manager(int Employeeid,String name,long salary,int teamsize, String dept) {
		super(Employeeid,name,salary);
		this.teamsize = teamsize;
		this.dept = dept;
	}
	
	
	
 public int getTeamsize() {
		return teamsize;
	}



	public void setTeamsize(int teamsize) {
		this.teamsize = teamsize;
	}



	public String getDept() {
		return dept;
	}



	public void setDept(String dept) {
		this.dept = dept;
	}
	
	

 @Override
	public String toString() {
		return "Manager [teamsize=" + teamsize + ", dept=" + dept + ", getName()=" + getName() + ", getEmployeeid()="
				+ getEmployeeid() + ", getSalary()=" + getSalary() + "]";
	}



 public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Manager m1=new Manager(103,"Ria",50000,89,"IT");
	 System.out.println(m1);

	}

}

package com.PratikshaSatpute.assignment.utilities;
import com.PratikshaSatpute.assignment.employees.Employee;
public class EmployeeUtilities {
	private int MONTHS = 12;
	public void printEmployeeDetails(Employee emp) {
		System.out.println(emp);
	}
	public long calculateAnnualSalary(Employee emp) {
		return emp.getSalary() * MONTHS;
	}
}
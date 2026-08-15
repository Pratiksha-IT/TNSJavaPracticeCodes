import com.PratikshaSatpute.assignment.employees.Manager;
import com.PratikshaSatpute.assignment.employees.Developer;
import com.PratikshaSatpute.assignment.utilities.EmployeeUtilities;

public class AssignmentMain {
	public static void main(String[] args) {
		Manager m1 = new Manager(103, "Ria", 50000, 89, "IT");
		Developer d1 = new Developer(102, "Ira", 70000, 9, "Software Developer");

		EmployeeUtilities util = new EmployeeUtilities();

		util.printEmployeeDetails(m1);
		util.printEmployeeDetails(d1);

		System.out.println(m1.getName() + " Annual Salary: " + util.calculateAnnualSalary(m1));
		System.out.println(d1.getName() + " Annual Salary: " + util.calculateAnnualSalary(d1));
	}
}
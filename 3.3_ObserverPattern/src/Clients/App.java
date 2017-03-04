package Clients;

import java.util.Date;

import Domain.Employee;
import Observers.HRDepartment;
import Observers.IObserver;
import Observers.PayrollDepartment;
import Subjects.EmployeeManagementSystem;

public class App {
	
	public static void main(String[] args) {
		
		IObserver payroll = new PayrollDepartment();
		IObserver hrSystem = new HRDepartment();
		
		EmployeeManagementSystem ems = new EmployeeManagementSystem();
		
		ems.registerObserver(payroll);
		ems.registerObserver(hrSystem);
		
		Employee bob = new Employee("Bob", new Date(), 35000, true);
		ems.hirNewEmployee(bob);
		
		ems.modifyEmployeeName(5, "Fan");
		ems.modifyEmployeeName(421432, "Fan");
		for (Employee emp : ems.getEmployees()) {
			System.out.println(emp.getName());
		}
	}
	
}

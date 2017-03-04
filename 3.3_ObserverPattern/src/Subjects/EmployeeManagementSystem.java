package Subjects;

import java.util.ArrayList;
import java.util.List;

import Domain.Employee;
import Domain.EmployeeDAO;
import Observers.IObserver;

public class EmployeeManagementSystem implements ISubject {

	private List<IObserver> observers;
	private List<Employee> employees;
	
	private EmployeeDAO employeeDao;
	
	private Employee employee;
	private String msg;
	
	public EmployeeManagementSystem() {
		this.observers = new ArrayList<IObserver>();
		this.employeeDao = new EmployeeDAO();
		this.employees = employeeDao.generateEmployees();
	}
	
	@Override
	public void registerObserver(IObserver o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(IObserver o) {
		observers.remove(o);
	}

	@Override
	public void notifyObserver() {
		for (IObserver department : observers) {
			department.callMe(employee, msg);
		}
	}
	
	public void hirNewEmployee(Employee emp) {
		employee = emp;
		msg = "New Hire: ";
		employees.add(emp);
		notifyObserver();
	}
	
	public void modifyEmployeeName(int id, String newName) {
		boolean notify = false;
		
		for (Employee emp : employees) {
			if (id == emp.getEmployeeID()) {
				emp.setName(newName);
				this.employee = emp;
				this.msg = "Employee name has been modified";
				notify = true;
			}
		}
		
		if (notify) {
			notifyObserver();
		}
	}

	public List<Employee> getEmployees() {
		return employees;
	}

}

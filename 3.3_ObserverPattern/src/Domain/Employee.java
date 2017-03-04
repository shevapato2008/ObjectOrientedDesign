package Domain;

import java.util.Date;

public class Employee {
	
	private String name;
	private Date hireDate;
	private int salary;
	private int employeeID;
	private boolean working = false;
	
	private static int COUNTER;
		// static variable!
		// efficient: will get memory only once
	
	public Employee(String name, Date hireDate, int salary, boolean working) {
		this.name = name;
		this.hireDate = hireDate;
		this.salary = salary;
		this.working = working;
		
		employeeID = ++COUNTER;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", hireDate=" + hireDate + ", salary=" + salary + ", employeeID=" + employeeID
				+ ", working=" + working + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeID() {
		return this.employeeID;
	}
	
}

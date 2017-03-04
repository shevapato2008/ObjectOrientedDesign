package Observers;

import Domain.Employee;

public interface IObserver {
	
	public void callMe(Employee emp, String msg);
	
}

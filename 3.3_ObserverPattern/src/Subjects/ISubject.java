package Subjects;

import Observers.IObserver;

public interface ISubject {
	
	public void registerObserver(IObserver o);
	public void removeObserver(IObserver o);
	public void notifyObserver();

}
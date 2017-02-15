package lesson2_openclosedprinciple;

public class Doctor extends Employee {

	public Doctor(int id, String name, String department, boolean working) {
		super(id, name, department, working);
		System.out.println("Doctor in action...");
	}
	
	private void prescribeMedicine() {
		System.out.println("Prescribe medicine");
	}
	
	private void diagnosePatients() {
		System.out.println("Diagnose patients");
	}

	@Override
	public void performDuties() {
		prescribeMedicine();
		diagnosePatients();
	}
}

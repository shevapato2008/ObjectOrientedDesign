package lesson2_openclosedprinciple;

public class HospitalManagement {
	
	public void callUpon(Employee employee) {
		employee.performDuties();
	}
	
    /*	
    public void callUpon(Employee employee) {
		if (employee instanceof Nurse) {
			checkVitalSigns();
			drawBlood();
			cleanPatientArea();
		} else if (employee instanceof Doctor) {
			prescribeMedicine();
			diagnosePatients();
		}
	}
	
	// Nurses
	private void checkVitalSigns() {
		System.out.println("Checking Vitals");
	}
	
	private void drawBlood() {
		System.out.println("drawing blood");
	}
	
	private void cleanPatientArea() {
		System.out.println("Clean patient area");
	}
	
	// Doctors
	private void prescribeMedicine() {
		System.out.println("Prescribe medicine");
	}
	
	private void diagnosePatients() {
		System.out.println("Diagnose patients");
	}
	*/
	
}

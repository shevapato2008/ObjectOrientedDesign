package reporting;

import domain.Employee;

public class EmployeeReportFormatter extends ReportFormatter {

	public EmployeeReportFormatter(Employee employee, FormatType formattype) {
		super(employee, formattype);
	}
	
	public String getFormattedEmployee() {
		return getFormattedOutput();
	}
	
}

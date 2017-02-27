package reporting;

public class ReportFormatter {
	
	String formattedOutput;
	
	public ReportFormatter(Object object, FormatType formattype) {
		switch(formattype) {
			case XML:
				formattedOutput = convertObjectToXML(object);
				break;
			case CSV:
				formattedOutput = convertObjectToCSV(object);
				break;
		}

	}
	
	private String convertObjectToXML(Object object) {
		return "XML : <title>" + object.toString() + "</title>";
	}
	
	private String convertObjectToCSV(Object object) {
		return "CSV : ,,, " + object.toString() + ",,,,";
	}

	protected String getFormattedOutput() {
		return formattedOutput;
	}

}

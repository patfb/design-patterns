package adapter;

public class EmployeeAdapterCSV implements Employee {

	private EmployeeCSV instance;

	public EmployeeAdapterCSV(EmployeeCSV instance) {
		this.instance = instance;
	}

	@Override
	public String getId() {
		return instance.getId() + ""; // adding a + "" converts the integer to a string
	}

	@Override
	public String getFirstName() {
		return instance.getFirstname();
	}

	@Override
	public String getLastName() {
		return instance.getLastname();
	}

	@Override
	public String getEmail() {
		return instance.getEmailAddress();
	}

}
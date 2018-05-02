package behavioral.strategy;

public class CreditCard {

	private String number;
	private String date;
	private String cvv;
	private ValidationStrategy strategy;

	public CreditCard(ValidationStrategy strategy) {
		this.strategy = strategy;
	}

	public String getCvv() {
		return cvv;
	}

	public String getDate() {
		return date;
	}

	public String getNumber() {
		return number;
	}

	public boolean isValid() {
		return strategy.isValid(this);
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setNumber(String number) {
		this.number = number;
	}

}

package entities;

public class BusinessAccount extends Account{
	
	private Double loaLimit;
	
	public BusinessAccount(){
		super();
	}
	public BusinessAccount(Integer number, String holder, Double balance, Double loaLimit) {
		super(number, holder, balance);
		this.loaLimit = loaLimit;
	}
	public Double getLoaLimit() {
		return loaLimit;
	}
	public void setLoaLimit(Double loaLimit) {
		this.loaLimit = loaLimit;
	}
	public void loan(double amount) {
		if (amount <= loaLimit) {
			deposit (amount);
		}
	}
}

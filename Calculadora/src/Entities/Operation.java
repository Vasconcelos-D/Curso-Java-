package Entities;

public abstract class Operation {

	protected double operacao1;
	protected double operacao2;
	
	public Operation(double operacao1, double operacao2) {
		super();
		this.operacao1 = operacao1;
		this.operacao2 = operacao2;
	}

	public abstract double execute();
	
}

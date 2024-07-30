package Entities;

public class Multiply extends Operation{

	public Multiply(double operacao1, double operacao2) {
		super(operacao1, operacao2);
	}
	
	public double execute() {
		return operacao1 * operacao2;
	}
}

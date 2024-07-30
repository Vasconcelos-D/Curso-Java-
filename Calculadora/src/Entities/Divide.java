package Entities;

public class Divide extends Operation {

	public Divide(double operacao1, double operacao2) {
		super(operacao1, operacao2);
	}

	@Override
	public double execute() {
		if (operacao2 == 0) {
			throw new ArithmeticException("Cannot divide by zero");
		}
		return operacao1 / operacao2;
	}
}

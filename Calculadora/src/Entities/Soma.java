package Entities;

public class Soma extends Operation{

	public Soma(double operacao1, double operacao2) {
		super(operacao1, operacao2);
	}

	@Override
	public double execute() {
		
		return operacao1 + operacao2;
	}	
}

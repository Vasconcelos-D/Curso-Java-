package Entities;

public class Calculator {
	
	private Operation operation;

	public void setOperation(Operation operation) {
		this.operation = operation;
	}
	
	public double computer() {
		if (operation == null) {
			throw new IllegalStateException("Operation not set");
		}
		return operation.execute();
	}
}

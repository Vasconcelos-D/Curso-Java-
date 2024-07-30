package application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Calculator;
import Entities.Divide;
import Entities.Multiply;
import Entities.Soma;
import Entities.Subtract;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter first number: ");
		double num1 = sc.nextDouble();
		System.out.print("Enter second number: ");
		double num2 = sc.nextDouble();
		
		System.out.print("Enter operaion ( +, -, *, / ): ");
		String operator = sc.next();
		
		Calculator calculator = new Calculator();
		
		switch (operator) {
		case "+":
			calculator.setOperation(new Soma(num1, num2));
			break;
		case "-":
			calculator.setOperation(new Subtract(num1, num2));
			break;
		case "*":
			calculator.setOperation(new Multiply(num1, num2));
			break;
		case "/":
			calculator.setOperation(new Divide(num1, num2));
			break;
		default:
			System.out.println("Invalid operator");
			return;
		}
		
		System.out.println(String.format("%.2f",  calculator.computer()));
				
		sc.close();
	}
}

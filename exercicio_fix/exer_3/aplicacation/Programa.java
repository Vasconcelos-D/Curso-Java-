package aplicacation;

import java.util.Locale;
import java.util.Scanner;
import util.CurrenteConverter;

public class Programa
{

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.print("Entre com valor do dolar: ");
		double dollarPrice = input.nextDouble();
		System.out.print("Quantos dolares você vai comprar? ");
		double amount = input.nextDouble();
		
		double result = CurrenteConverter.dollarToReal(amount, dollarPrice);
		System.out.printf("Valor em reais é: %.2f%n ", result);
		
		
		
		input.close();
	}

}

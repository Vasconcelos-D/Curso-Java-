package aplication;

import java.util.Locale;
import java.util.Scanner;
import banco.Conta;

public class Programa
{
	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta cconta;
		
		System.out.print("Entre com o numero da Conta:");
		int numero = sc.nextInt();
		
		System.out.print("Entre com nome do proprietario da Conta:");
		sc.nextLine();
		String nome = sc.nextLine();
		
		System.out.print("Existe um deposito inicial? ( s/n ) ");
		char response = sc.next().charAt(0);
		
		if (response == 's')
		{
			System.out.print("Entre com um valor inicial:");
			double inicialDeposito = sc.nextDouble();
			cconta = new Conta(numero, nome, inicialDeposito);
		}
		else
		{
			cconta = new Conta (numero, nome);
		}
		System.out.println();
		System.out.println("Conta data: ");
		System.out.println(cconta); 
		
		System.out.println();
		System.out.print("Entre com valor de deposito: ");
		double depositoValor = sc.nextDouble();
		cconta.deposito(depositoValor);
		System.out.println("Atualização de conta data: ");
		System.out.println(cconta);
		
		System.out.println();
		System.out.print("Entre com o valor de retirada: ");
		double retiraValor = sc.nextDouble();
		cconta.reritar(retiraValor);
		System.out.println("Atualização de conta data: ");
		System.out.println(cconta);
		
		sc.close();
	}

}

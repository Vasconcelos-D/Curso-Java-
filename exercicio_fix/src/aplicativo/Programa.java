package aplicativo;

import java.util.Locale;
import java.util.Scanner;
import func.Funcionario;
public class Programa
{

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		Funcionario sliq = new Funcionario();
		
		System.out.print("Entre com nome: ");
		sliq.nome = input.nextLine();
		
		System.out.print("Entre com Salario: ");
		sliq.salario = input.nextDouble();
		
		System.out.print("entre com a Taxa: ");
		sliq.taxa = input.nextDouble();
		
		System.out.println();
		System.out.println("Funcionario" + sliq);
		
		System.out.println();
		System.out.println("Qual a porcentagem de acresscimo do salario? ");
		double percentual = input.nextDouble();
		sliq.addSalario(percentual);
		
		
		System.out.println();
		System.out.println("Valor atualizado: " + sliq); 
					
		input.close();
	}

}

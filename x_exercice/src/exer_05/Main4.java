package exer_05;
// Calculo de impostos

import java.util.Locale;
import java.util.Scanner;
// Programa para calculo de imposto.
public class Main4 {

	public static void main(String[] args)
	{	
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);// Declarando entrada de dados
		
		System.out.println("Digite seu Salario: ");// Pedindo os dados
		// Declarando as variavéis
		
		double salario = input.nextDouble();
		double imposto;
		// Inicio da Estrutura Condicional If e Else.
		// If( Se )
		// Eslse (Se não )
		// Else if ( Se não, se)
		
		/* Para condição simples, apenas um if e else, que tem apenas uma condição, ser verdadeiro ou falto.
		 */
		
		/* Para condições composta de varios endeamentos, usa-se ( Else if) çara ter mais condições, deposi que testar 
		 o Primeiro if. 
		 */
		
		
		if (salario <= 2000.00) 
		{
			imposto = 0.0;// Se for verdade, calcula o imposto, se não, pula pra próxima condição. 
		}
		else if (salario <= 3000.00)
		{
			imposto = (salario - 2000.0) * 0.08;
		}
		else if (salario <= 4500.00)
		{
			imposto = ( salario - 3000.0) * 0.18 + 1000.0 * 0.08;
		}
		else 
		{
			imposto = ( salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}
		if (imposto == 0.0)
		{
			System.out.println("Insento");
		}
		else // Fim da condição
		{
			System.out.printf("R$ %.2f%n", imposto); // Imprime na tela o valor do calculo.
		}
		input.close();

	}

}

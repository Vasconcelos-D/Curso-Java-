package exer_01;
// Exercicio de condições If, Else.
import java.util.Locale;
import java.util.Scanner;// ctr + shift + o ( atalho para import Scanner)
public class Main2
{

	public static void main(String[] args) 
	{
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		/*  Ao entrar com a quantidade, programa faz calçulo do valor. 
		 * Quantidade(*) valor do produto. Então é impresso na tela o valor 
		 * total.
		 */
		// Declarando variavéis, para entrada de dados. codido e quantidade.
		
		int cod = input.nextInt();
		int quant = input.nextInt();
		
		double total;
		// Inicio dos testes de condições. 
			if (cod == 1) 
			{
				total = quant * 4.0;
			}
			else if (cod == 2)
			{
				total = quant * 4.5;
			}
			else if (cod == 3)
			{
				total = quant * 5.0;
			}
			else if (cod == 4)
			{
				total = quant * 2.0;
			}
			
			else
			{
				total = quant * 1.5;
			}
			
			System.out.printf("o Total é: %.2f%n", total);
		
		
		input.close();
	}

}

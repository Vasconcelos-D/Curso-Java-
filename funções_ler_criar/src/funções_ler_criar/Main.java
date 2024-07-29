package funções_ler_criar;
// Programa para imprimir o maior entre os números
// Criando funções para usar no codigo.
import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Entre com os números: ");// Prompt de entrada de dados
		//Declarndo as VARIAVÉIS e já recebendo os dados 
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		int maior = max(a, b, c);// Função criada logo abaixo para mostrar o maior.
		
		result(maior);// Função para exibir o maior.
		
		input.close();
	}
	// Criando a funcão max para ser utilizada no codigo acima
	public static int max(int x, int y, int z)
	/* especificando que o retorno é de um inteiro, que tem como nome (Max) e em seguida os parâmetros int x, int y, int z.
	 */
	{
		int aux;// Declarando variável local.
		// Aplicando a logica para que ela return o maior.
		if (x > y && x > z)
		{
			aux = x;
		}
		else if ( y > z)
		{
			aux = y;
		}
		else 
		{
			aux = z;
		}
		return aux;// return do valor AUX que recebera o maior entre as condições
	
	}
	
	public static void result(int value)
	{
		System.out.println("O maior é:" + value);
	}

}

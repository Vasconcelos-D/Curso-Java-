package debug_eclipse;
import java.util.Locale;
import java.util.Scanner;
public class Main 
{

	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.print("Entre com a largura: ");
		double largura = input.nextDouble();
		
		System.out.print("Entre com o comprimento: ");
		double comprimento = input.nextDouble();
		
		System.out.print("Entre com o valor do metro: ");
		double metroQuadrado = input.nextDouble();
		
		double area = largura * comprimento;
		double preco = largura * metroQuadrado;
		
		System.out.printf("Valor da Area é: %.2f%n ", area);
		System.out.printf("Valor é: %.2f%n", preco);
		
		input.close();

	}

}

package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;
// Usando a o atributo:(length)(é a quantidade de variavel ao vetor., tem como vantage não precisar usar outra variável no codigo.
//Ao usar o atributro lenght, não precisa de uma var para dizer a quantidade, ele mesmo já sabe a sua quantidade...
public class Program
{
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		
		for (int i = 0 ; i < vect.length ; i++ )
		{
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}
		double sum = 0.0;
		for (int i = 0 ; i < vect.length ; i++)
		{
			sum += vect[i].getPrice();
		}
		double avg  = sum / vect.length;
		
		System.out.printf("Avarege price: %.2f", avg);
		
		sc.close();
	}
}

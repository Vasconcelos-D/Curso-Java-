package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import entidade.Retangulo;
public class Programa
{

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		Retangulo ret = new Retangulo();
		
		System.out.println("Entre com a Largura e Altura: ");
		ret.largura = input.nextDouble();
		ret.altura = input.nextDouble();
		
		System.out.printf("Área é = %.2f%n", ret.area());	
		System.out.printf("Perímetro é = %.2f%n", ret.perimetro());	
		System.out.printf("Diagonal é = %.2f%n", ret.diagonal());
		
		
		input.close();
	}

}

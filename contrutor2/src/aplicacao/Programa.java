package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import entidade.Produto;
public class Programa 
{

	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com produto: ");
		System.out.print("Nome:  ");
		String nome = sc.nextLine();
		
		System.out.print("Valor:  ");
		double valor = sc.nextDouble();
		
		Produto produto = new Produto(nome, valor);
		
		System.out.println();
		System.out.println("Produto em caixa: " + produto);
		
		System.out.println();
		System.out.print("Qual a quantidade a ser adicionada ao estoque: ");
		int quantidade = sc.nextInt();
		produto.addProduto(quantidade);
		
		System.out.println();
		System.out.println("Updated data: " + produto);
		System.out.println();
		System.out.print("Qual a quantidade a ser removida do estoque: ");
		quantidade = sc.nextInt();
		produto.removeProduto(quantidade);
		System.out.println();
		System.out.println("Updated data: " + produto);
	
		sc.close();
	}

}

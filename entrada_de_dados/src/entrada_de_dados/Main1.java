package entrada_de_dados;
//Programa para ler um texto até a quebra de linda.
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	/*	String s1, s2, s3;//Declarando o tipo das variavéis.
		// Atribuindo o valor da qual irão receber da entrada de dados pelo metodo (Scanner)
		
		//sc.nextLine(); serva para ter a quebra de linha.
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados Digitados:");//Impresso na tela o que for digiatdo pela entrada da dados.
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);*/
		
		//ATENÇÃO A QUEBRA DE LINHA PENDENTE.
		
		/*Quando você usa um comando de 
		leitura diferente do nextLine() e 
		dá alguma quebra de linha, essa 
		quebra de linha fica "pendente" 
		na entrada padrão.
		Se você então fizer um nextLine(), 
		aquela quebra de linha pendente 
		será absorvida pelo nextLine(). */
		
		
		
		int x;
		String s1, s2, s3;//Declarando o tipo das variavéis.
		// Atribuindo o valor da qual irão receber da entrada de dados pelo metodo (Scanner)
		
		//sc.nextLine(); serva para ter a quebra de linha.
		x = sc.nextInt();
		sc.nextLine();//Solução:Faça um nextLine() extra antes de fazer o nextLine() de seu interesse
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados Digitados:");//Impresso na tela o que for digiatdo pela entrada da dados.
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
	}

}

package entrada_de_dados;
import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); // Objeto obrigatorio da LP java, para entrada de dados, recebidas pelo o Teclado.
		//Declarando as variáveis
		
	  //char x;
		String x;
		int y;
		double z;
		//Atribuindo o comando de entrdada de dados.
		//sc.next().
		//Para cada tipo de variavél, um comando de codigo especifico tem que ser atribuido a ele.
		//Como mostra na linha abaixo.
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
	  //w = sc.next.charAt(); 
		
		//imprimindo os dados na tela.
		//Saida de dados.
		System.out.println("Dados digitados:" );
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		
		sc.close();// Fim do metodo Scaner.sc
		
	}

}

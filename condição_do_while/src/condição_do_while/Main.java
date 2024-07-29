package condição_do_while;

import java.util.Locale;
import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		char resp ;
		
		do
		{
			System.out.print("Digite a temperatura Celsius: ");
			double C = input.nextDouble();
			
			double F = 9.0 * C / 5.0 + 32.0;
			
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
			System.out.print("Deseja repitir (s/n)? " ); 
			
			resp = input.next().charAt(0); 
			

		 }while (resp != 'n');
		

		
		input.close();
	 }

}

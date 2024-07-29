package condição_for;
//P
import java.util.Scanner;

public class Main6 
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		
		for (int i = 2 ; i <= x ; i++)
		{
			int primeiro = i;
			int segundo = i * i;
			int terceiro = i * i * i;
			
			System.out.printf("%d %d %d %n", primeiro, segundo, terceiro);
		}
		
		input.close();
	}

}

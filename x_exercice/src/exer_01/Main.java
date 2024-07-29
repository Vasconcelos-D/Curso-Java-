package exer_01;
import java.util.Locale;
import java.util.Scanner; 
public class Main
{
    public static void main(String[] args) //  Metodo main.
    {
    	Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
           

	    System.out.print("Entre com codigo:");
	    
	    int cod = input.nextInt();
        while (cod != 2002)
	    {
        	System.out.println("Acesso Invalido" );
     	     cod = input.nextInt();
        }
        
        System.out.println("Acesso Permitido" );
        
        
	    input.close();
    }

}
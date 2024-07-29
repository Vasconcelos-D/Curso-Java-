package arquivos;

import java.io.File;
import java.util.Scanner;

public class Caminho_Arquivo {
	
	public static void main (System[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a folfer path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("getPath: " + path.getName());

		sc.close();	
		
	}
}

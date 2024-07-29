package arquivos;

import java.io.File;
import java.util.Scanner;

public class Program_past {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a  folder path: ");
		String strPath = sc.nextLine();
		// Digitar o caminho desejado
		File path = new File(strPath);
		// instanciado OBJ
		File[] folders = path.listFiles(File::isDirectory);
		// atribudindo vetor para listar os aquivos filtrados do caminho digitado.
		System.out.println("FOLDERS:");
		for (File folder : folders) {
			System.out.println(folder);
			//buscando os arquivos, para salvar a imprimir.
		}
		
		File[] files = path.listFiles(File::isFile);
		// comando para buscar os arquivos fora de pastas.
		System.out.println("FILES:");
		for (File file : files) {
			System.out.println(file);
			//buscando os arquivos, para salvar a imprimir.
		}
		
		boolean success = new File(strPath  + "\\subdir").mkdir();
		System.out.println("Directory created successfully: " + success);
		sc.close();	
	}
}

package arquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program_out {

	public static void main(String[] args) {
		
		String[] lines = new String[] {"Akon", "50 Cent", "Eminem"};
		
		String path = "c:\\Users\\IFPB.IP\\eclipse-workspace\\Out.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}

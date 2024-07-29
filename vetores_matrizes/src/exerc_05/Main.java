package exerc_05;

import java.util.Locale;
import java.util.Scanner;

public class Main 
{

	public static void main(String[] args)
	{
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	System.out.print("How many rooms will be rentend?");
	int n = sc.nextInt();
	
	String[] name = new String[n];
	String[] email = new String[n];
	int [] room = new int[n];
	
	for (int i = 0 ; i < n ; i++)
	{
		System.out.print("Enter Name: ");
		sc.next();
		name[i] = sc.nextLine();
		System.out.print("Enter E-mail: ");
		sc.next();
		email[i] = sc.nextLine();
		System.out.print("Enter Room :");
		room[i] = sc.nextInt();
	}
	
	
	
	
	sc.close();
	}

}

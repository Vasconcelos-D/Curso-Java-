package application;
//Programa com objetos
import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;
public class Program
{

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		System.out.println("Enter the measure of triangle X: ");
		x.a = input.nextDouble();
		x.b= input.nextDouble();
		x.c = input.nextDouble();
		System.out.println("Enter the measure of Y: ");
		y.a = input.nextDouble();
		y.b = input.nextDouble();
		y.c = input.nextDouble();
		
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle X area: %.4f%n", areaY);
		
		if (areaX > areaY)
		{
			System.out.println("Larger area: X ");
		}
		else
		{
			System.out.println("Larger area: Y ");
		}
		
		input.close();
	}

}

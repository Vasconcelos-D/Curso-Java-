package application;

import java.util.Locale;
import java.util.Scanner;

public class Main 
{

	public static void main(String[] args)
	{

			Locale.setDefault(Locale.US);
			Scanner input = new Scanner(System.in);
			
			double xA, xB, xC, yA, yB,yC;
			System.out.println("Enter the measure of triangle X: ");
			xA = input.nextDouble();
			xB = input.nextDouble();
			xC = input.nextDouble();
			System.out.println("Enter the measure of Y: ");
			yA = input.nextDouble();
			yB = input.nextDouble();
			yC = input.nextDouble();
			
			double p = (xA + xB + xC)/2.0;
			double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
			
			p = (yA + yB + yC)/2.0;
			double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
			
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

package util;

public class CurrenteConverter
{
	public static double IOF = 0.06;
	
	public static double dollarToReal(double amount, double dollarPrice)
	{
		return amount * dollarPrice * (1.0 + IOF);
	}

}

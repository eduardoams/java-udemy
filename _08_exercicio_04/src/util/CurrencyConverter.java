package util;

public class CurrencyConverter {

	public static final double iof = 0.06;
	
	public static double converter(double coinPrice, double amountCurrency) {
		
		double converter = coinPrice * amountCurrency;
		return iof * converter + converter;
	}
	
}

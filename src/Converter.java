//This is the development branch

public class Converter {
	//Your names go here:
	/*
	 * @Author: Brendan Mahler
	 *			Khoi Ngo
	 *			Branden Shin
	 */
	
	private double celsiusToFahrenheit(double C) {
		//TODO: The third student will implement this method
		return (C*9/5)+32;
	}
	
	private double fahrenheitToCelsius(double F) {
		//TODO: The second student will implement this method
		return (F-32)*5/9;
	}

	private double kilometersToMiles(double K) {
		//TODO: The second student will implement this method
		return K * 0.62137;
	}
	
	public static void main(String[] args) {
		Converter convert = new Converter();
		System.out.println(convert.celsiusToFahrenheit(180));
		System.out.println(convert.fahrenheitToCelsius(250));

		System.out.println(convert.kilometersToMiles(30));
		
	}
	
}
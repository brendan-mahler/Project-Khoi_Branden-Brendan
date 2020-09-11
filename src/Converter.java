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
	
	public static void main(String[] args) {
		Converter tempConvert = new Converter();
		System.out.println(tempConvert.celsiusToFahrenheit(180));
		System.out.println(tempConvert.fahrenheitToCelsius(250));
		
	}
	
}
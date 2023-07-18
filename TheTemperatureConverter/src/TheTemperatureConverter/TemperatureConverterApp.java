package TheTemperatureConverter;

public class TemperatureConverterApp {
	public static void main(String[] args) {
		TemperatureConverter t = new TemperatureConverter();
		System.out.printf("%.2f",t.convertFahrenheitToCelsius(98.0));
	}

}

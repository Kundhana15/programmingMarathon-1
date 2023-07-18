package TimeConverter;

import java.util.Scanner;

public class TimeConverter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble();
		double res=hoursConverter(a);
		System.out.println(res);
	}
	public static double hoursConverter(double minutes)
	{
		return minutes/60;
	}

}

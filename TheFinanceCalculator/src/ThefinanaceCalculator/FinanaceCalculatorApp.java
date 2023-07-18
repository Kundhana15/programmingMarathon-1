package ThefinanaceCalculator;

import java.util.Scanner;

public class FinanaceCalculatorApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double p = scan.nextDouble();
		double t = scan.nextDouble();
		double r = scan.nextDouble();
		FinanceCalculator c = new FinanceCalculator();
		System.out.printf("%.2f",c.simpleInterest(p,t,r));
		scan.close();
	}

}

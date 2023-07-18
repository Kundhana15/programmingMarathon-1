package HalveIt;

import java.util.Scanner;

public class HalveTheNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double num = scan.nextDouble();
		System.out.printf("%.2f",numberHalving(num));
	}
	public static double numberHalving(double num)
	
	{
		return num/2;
	}

}

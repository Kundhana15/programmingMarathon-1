package saturaday_Marathon;

import java.util.Scanner;

public class GalacticArthimetic {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long a= scan.nextLong();
		long b = scan.nextLong();
		long res = galacticAddition(a,b);
		System.out.println(res);
	}
	public static long galacticAddition(long num1, long num2)
	{
		return num1+num2;
	}

}

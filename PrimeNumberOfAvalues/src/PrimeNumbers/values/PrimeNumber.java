package PrimeNumbers.values;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i=2;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println("its prime");
				break;
			}
			else
			{
				System.out.println("its not a prime");
				break;
			}
		}
	}

}

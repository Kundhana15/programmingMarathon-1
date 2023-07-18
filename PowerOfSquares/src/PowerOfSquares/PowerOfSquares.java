package PowerOfSquares;

import java.util.Scanner;

public class PowerOfSquares {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		System.out.println(squareNumber(a));
		scan.close();
		
	}
	public static int squareNumber(int num)
	{
		return num*num;
	}

}

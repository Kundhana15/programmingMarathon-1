package TheHeightConverter;

import java.util.Scanner;

public class HeightConverterApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble();
		HeightConverter h = new HeightConverter();
		System.out.printf("%.2f", h.calculateHeight(a));
		scan.close();
	}

}

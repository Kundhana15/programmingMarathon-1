package ThePlanetExplorer;

import java.util.Scanner;

public class PlanetExplorerApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble();
		PlanetExplorer p= new PlanetExplorer();
		System.out.printf("%.2f", p.surfaceArea(a));
		
	}

}
